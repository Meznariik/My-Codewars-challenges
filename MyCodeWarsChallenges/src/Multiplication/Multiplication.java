package Multiplication;
// check whether the number is even
// if yes, multiply it by 8
// otherwise multiply it by 9

public class Multiplication {

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0){
            return  n * 8;
        }
        else {
            return n * 9;
        }
    }

    public static void main(String[] args) {
        System.out.println(simpleMultiplication(10));
    }
}
