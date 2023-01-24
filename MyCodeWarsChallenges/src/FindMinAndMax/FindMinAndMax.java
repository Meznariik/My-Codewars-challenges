package FindMinAndMax;

//Your task is to make two functions ( max and min, or maximum and minimum, etc.), depending on the language
//that receive a list of integers as input,
//and return the largest and lowest number in that list, respectively.

public class FindMinAndMax {

    public int min(int[] list) {
        int minValue = list[0];

        for (int i = 0; i < list.length; i++){
            if (minValue < list[i]) {
                minValue = minValue;
            }
            else {
                minValue = list[i];
            }
        }

        return minValue;
    }

    public int max(int[] list) {
        int maxValue = list[0];

        for (int i = 0; i < list.length; i++){
            if (maxValue > list[i]) {
                maxValue = maxValue;
            }
            else {
                maxValue = list[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        FindMinAndMax obj = new FindMinAndMax();
        System.out.println(obj.min(new int[]{1,2,5,-1,8,7,0}));
        System.out.println(obj.max(new int[]{1,2,5,-1,8,7,0}));
    }
}
