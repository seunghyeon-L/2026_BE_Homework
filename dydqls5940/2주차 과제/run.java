import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String name : callings) {
            int idx = map.get(name);
            String front = players[idx - 1];
            players[idx - 1] = name;
            players[idx] = front;
            map.put(name, idx - 1);
            map.put(front, idx);
        }
        return players;
    }
}
