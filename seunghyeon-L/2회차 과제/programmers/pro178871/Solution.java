package programmers.pro178871;
import java.util.HashMap;

public class Solution {
    public String[] solution(String[] players, String[]
            callings) {

        // 이름 → 현재 인덱스 매핑
        HashMap<String, Integer> play = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            play.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            int x = play.get(callings[i]);
            String temp = players[x - 1];
            players[x - 1] = callings[i];
            players[x] = temp;

            play.put(callings[i], x - 1);
            play.put(temp, x);
        }
        return players;
    }
}
