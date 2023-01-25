package DoubleChar;

public class DoubleChar {
    public static String doubleChar(String s){
        String repeated = "";
        for (int i = 0; i < s.length(); i++){

            repeated += s.charAt(i);
            repeated += s.charAt(i);
        }

        return repeated;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
}
