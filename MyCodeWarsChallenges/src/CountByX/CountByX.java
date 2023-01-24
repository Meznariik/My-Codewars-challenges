package CountByX;

/*Create a function with two arguments that will return an array of the first n multiples of x.
Assume both the given number and the number of times to count will be positive numbers greater than 0.
Return the results as an array or list ( depending on language ).*/

import java.sql.SQLOutput;

public class CountByX {
    public static int[] countBy(int x, int n) {
        int[] countX = new int[n];

        for (int i = 0; i < n; i++) {
            int addValue = x * (i+1);
            countX[i] = addValue;
        }
        return countX;
    }
    public static void main(String[] args) {
        for (int count : countBy(5, 10)
             ) {
            System.out.print(count + ", ");
        }
    }
}
