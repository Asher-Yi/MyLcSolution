class Solution {
    static double[] pow;
    public static double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1/x;

        pow = new double[(Math.abs(n) >> 1) + 1];

        return n > 0 ? calcPositivePow(x, n) : 1 / calcPositivePow(x, -n);
    }
    private static double calcPositivePow(double x, int n) {
        System.out.println("x = " + x);
        System.out.println("n = " + n);
        if(x == 0) return 0;
        if(n == 1) return x;

        int half = n >> 1;
        if(pow[half] == 0)
            pow[half] = calcPositivePow(x, n >> 1);
        System.out.println("half = " + half);
        System.out.println("pow[half] = " + pow[half]);

        double sqrtRes = pow[half];
        return (n & 1) == 0 ? sqrtRes * sqrtRes : sqrtRes * sqrtRes * x;
    }
}
public class Main {
    public static void main(String[] args) {
       Solution.myPow(0.00001, Integer.MAX_VALUE >> 2);
    }
}