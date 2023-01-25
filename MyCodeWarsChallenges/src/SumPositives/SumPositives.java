package SumPositives;
//iterate through array
//check if value is positive
// if yes, add value to sum variable

public class SumPositives {

    public static int sum(int[] arr){
        int sum = 0;

        for (int num : arr){
            if (num > 0){
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{5,9,-5,-1,0,6}));
    }
}
