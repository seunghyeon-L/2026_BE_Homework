//프로그래머스 178871 (달리기 경주),
class Solution1 {
    public String[] solution(String[] players, String[] callings) {

        for (String calling : callings) {
            int currentRank = -1;

            for (int i = 0; i < players.length; i++) {
                if (players[i].equals(calling)) {
                    currentRank = i;
                    break;
                }
            }

            if (currentRank > 0) {
                String frontPlayer = players[currentRank - 1];
                players[currentRank - 1] = players[currentRank];
                players[currentRank] = frontPlayer;
            }
        }

        return players;
    }
}