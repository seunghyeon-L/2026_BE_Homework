import java.util.Arrays;
import java.util.HashMap;

class Problem1 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        // 자바버전 딕셔너리
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            map.put(players[i],i);
        }

        for(int i=0; i<callings.length; i++){
            String name1 = callings[i];
            int j = map.get(name1);
            String name2 = players[j-1];

            players[j] = name2;
            players[j-1] = name1;

            map.put(name1, j-1);
            map.put(name2, j);
        }

        return players;
    }

    public static void main(String[] args) {
        Problem1 problem = new Problem1();

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] result = problem.solution(players, callings);
        System.out.println(Arrays.toString(result));
    }
}