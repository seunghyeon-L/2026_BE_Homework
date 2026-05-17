// 같은 숫자는 싫어

public class Week3Problem2 {
    public static int[] solution(int []arr) {


        int prev = arr[0];
        int n = 1;
        for(int i=1;i<arr.length;i++){
            if(prev!=arr[i]){
                n++;
                prev = arr[i];
            }
        }

        int[] answer = new int[n];

        prev = arr[0];
        answer[0] = arr[0];
        n = 1;
        for(int i=1;i<arr.length;i++){
            if(prev!=arr[i]){
                answer[n]=arr[i];
                n++;
                prev = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
