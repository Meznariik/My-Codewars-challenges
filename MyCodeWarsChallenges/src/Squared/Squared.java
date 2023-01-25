package Squared;

import static java.lang.Math.sqrt;

public class Squared {
    public static boolean isSquare(int n) {
        int x = (int) sqrt(n);
        int y = x * x;
        return n == y;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
}
