package RemoveSpaces;

public class RemoveSpaces {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("Removing spaces is easy."));
    }
}
