// 둘만의 암호

public class Week3Problem1 {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<skip.length();i++){
            alphabet = alphabet.replace(String.valueOf(skip.charAt(i)),"");
        }

        for(int i=0;i<s.length();i++){
            answer+=alphabet.charAt((alphabet.indexOf(s.charAt(i))+index)%alphabet.length());
        }


        return answer;

    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(solution(s, skip, index)); // 정답: ezppa
    }

}
