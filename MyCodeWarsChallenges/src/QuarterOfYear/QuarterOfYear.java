package QuarterOfYear;
//Test whether the number is less than 3, 6, 9 or 12
//Based on that assign the value to the correct quarter

public class QuarterOfYear {
    public static int quarterOf(int month) {
        if (month >= 1 && month <= 3){
            return 1;
        } else if (month <= 6) {
            return 2;
        } else if (month <= 9) {
            return 3;
        } else if (month <= 12) {
            return 4;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(12));
    }

}
