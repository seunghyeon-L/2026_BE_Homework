package programmers.pro1845;

import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> poke = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            poke.put(nums[i],i);
        }
        int answer=(nums.length/2)<poke.size()?(nums.length/2):poke.size();
        return answer;
    }
}
