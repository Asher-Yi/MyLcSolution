package com.neetcode.roadmap.BitManipulation;

public class lc191 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int total = 0;
            for(int i = 0; i < 32; i++){
                if((n & (1 << i)) != 0) total++;
            }
            return total;
        }
    }
}
