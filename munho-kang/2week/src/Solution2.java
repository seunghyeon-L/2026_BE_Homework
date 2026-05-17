//프로그래머스 1845 (폰켓몬)

import java.util.HashSet;

class Solution2 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int m = nums.length / 2;

        int C= set.size();

        return Math.min(m, C);
    }
}