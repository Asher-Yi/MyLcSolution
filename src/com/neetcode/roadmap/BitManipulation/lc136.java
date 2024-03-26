package com.neetcode.roadmap.BitManipulation;

public class lc136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int len = nums.length;
            if(len == 1) return nums[0];

            int res = 0;
            for(int num : nums) res ^= num;

            return res;
        }
    }
}
