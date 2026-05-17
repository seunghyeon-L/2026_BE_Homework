import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Car> map = new HashMap<>();
        for (String record : records) {
            String[] arr = record.split(" ");
            String[] t = arr[0].split(":");
            int minute = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            String carnum = arr[1];
            String now = arr[2];

            map.putIfAbsent(carnum, new Car());
            Car car = map.get(carnum);

            if (now.equals("IN")) {
                car.inTime = minute;
            } else {
                car.totalTime += minute - car.inTime;
                car.inTime = -1;
            }
        }
        int end = 23 * 60 + 59;
        for (Car car : map.values()) {
            if (car.inTime != -1) {
                car.totalTime += end - car.inTime;
            }
        }
        int n = map.size();
        for (Car car : map.values()) {
            int time = car.totalTime;
            if (time <= fees[0]) {
                car.totalTime = fees[1];
            } else {
                car.totalTime = fees[1] + (int) Math.ceil((time - fees[0]) / (double) fees[2]) * fees[3];
            }
        }

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int[] answer = new int[keys.size()];
        int idx = 0;
        for (String key : keys) {
            answer[idx++] = map.get(key).totalTime;
        }
        return answer;
    }
}

class Car {
    int inTime = -1;
    int totalTime = 0;
}
