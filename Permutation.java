import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(isPermutationV2(str1, str2));
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
        return ch1.equals(ch2);
    }

    public static boolean isPermutationV2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        if (str1.length() > 128)
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                int num = map.get(ch);
                map.replace(ch, num + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) <= 0) {
                    return false;
                } else {
                    map.replace(c, map.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        System.out.println(map);
        return true;
    }
}
