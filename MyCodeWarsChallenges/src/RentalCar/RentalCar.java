package RentalCar;

/*Every day you rent the car costs $40.
If you rent the car for 7 or more days, you get $50 off your total.
Alternatively, if you rent the car for 3 or more days, you get $20 off your total.*/

public class RentalCar {
    public static int rentalCarCost(int d) {
        int total = 0;
        if (d < 3){
            total = d * 40;
        } else if (d < 7) {
            total = (d * 40) - 20;
        } else {
            total = (d * 40) - 50;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(8));
    }
}
