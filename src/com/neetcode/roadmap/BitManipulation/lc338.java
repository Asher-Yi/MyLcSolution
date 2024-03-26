package com.neetcode.roadmap.BitManipulation;

public class lc338 {
    class Solution {
        public int[] countBits(int n) {
            int[] res = new int[n + 1];
            for(int i = 0; i <= n; i++) res[i] = countBit(i);
            return res;
        }

        private int countBit(int n) {
            if(n == 0) return 0;
            if(n == 1 || n == Integer.MIN_VALUE) return 1;
            int res = 0;
            for(int i = 0; i < 32; i++){
                if((n & 1) == 1) res++;
                n >>= 1;
            }
            return res;
        }
    }
}
