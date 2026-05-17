import java.util.Arrays;
class Problem2 {
    public int solution(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return nums.length / 2;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();

        int[] nums1 = {3, 1, 2, 3};
        System.out.println(problem.solution(nums1)); // 기댓값: 2

        int[] nums2 = {3, 3, 3, 2, 2, 4};
        System.out.println(problem.solution(nums2)); // 기댓값: 3

        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(problem.solution(nums3)); // 기댓값: 2
    }
}