import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = nums.length;
        int answer = 0;
        int t = set.size();
        if (n / 2 > t) {
            answer = t;
        } else {
            answer = n / 2;
        }
        return answer;
    }
}
