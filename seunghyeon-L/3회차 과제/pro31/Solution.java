package programmers.pro31;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[count] = arr[i];
                count++;
            }
        }

        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}