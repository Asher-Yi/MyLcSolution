package com.neetcode.roadmap.BitManipulation;

public class lc190 {
    public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(n)).reverse();
            for(int i = sb.length(); i < 32; i++){
                sb.append(0);
            }
            return Integer.parseUnsignedInt(sb.toString(), 2);
        }
    }
}
