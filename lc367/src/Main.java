import java.math.BigInteger;

class Solution {
    public static boolean isPerfectSquare(int num) throws InterruptedException {
        if (num == 1) return true;
        if (num < 4) return false;
        if (num == 4) return true;
        if (num < 9) return false;
        if (num == 9) return true;
        if (num < 16) return false;
        if (num == 16) return true;
        if (num < 25) return false;
        if (num == 25) return true;
        if (num < 36) return false;
        if (num == 36) return true;

        int l = 1, r = num / 3 + 1,m;
        BigInteger mid;
        BigInteger bigNum = BigInteger.valueOf(num);
        while (l < r) {
            m = l + (r - l) / 2;
            mid = BigInteger.valueOf(m);
            mid = mid.multiply(mid);
            int cmp = mid.compareTo(bigNum);
            if (cmp == 0) return true;
            else if (cmp < 0) l = m + 1;
            else r = m;
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Solution.isPerfectSquare(808201);
    }
}