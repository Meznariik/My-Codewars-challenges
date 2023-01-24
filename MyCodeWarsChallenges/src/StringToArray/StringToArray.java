package StringToArray;

import java.util.Arrays;

public class StringToArray {
    public static String[] stringToArray(String s) {

        return s.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Testing how the split method works")));
    }
}
