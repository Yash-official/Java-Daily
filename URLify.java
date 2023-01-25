public class URLify {
    public static void main(String[] args) {
        System.out.println(urlify("Jr Sam  "));
    }

    public static String urlify(String str) {
        return str.trim().replace(" ", "%");
    }
}