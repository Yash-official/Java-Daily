import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(isPermutation(str1, str2));
        scan.close();
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        if (str1.length() > 128)
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch2.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
