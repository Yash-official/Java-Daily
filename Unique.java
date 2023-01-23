public class Unique {
    public static void main(String[] args) {
        System.out.println(isUnique("yashwanth"));
    }

    public static boolean isUnique(String str) {
        boolean[] set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (set[str.charAt(i)]) {
                return false;
            }
            set[str.charAt(i)] = true;
        }
        return true;
    }
}