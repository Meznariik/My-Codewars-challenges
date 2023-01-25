package PlayingBanjo;
//extract the first letter of the input String
//check whether it starts with an R/r
//if yes, output name + " plays banjo"
//else output name + " does not play banjo"

public class PlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        String first = name.charAt(0)+"";
        return first.equalsIgnoreCase("R") ? name + " plays banjo" : name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Riaan"));
    }
}
