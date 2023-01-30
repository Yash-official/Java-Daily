import java.util.Collections;
import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String[] args) {
        String[] strs = new String[] {
                "kayak",
                "deified",
                "rotator",
                "repaper",
                "deed",
                "peep",
                "wow",
                "noon",
                "civic",
                "racecar",
                "level",
                "mom",
                "bird rib",
                "taco cat",
                "UFO tofu"
        };
        for (String string : strs) {
            System.out.println(isPalindromePermutation(string));
        }
    }

    public static boolean isPalindromePermutation(String str) {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (char a : str.toCharArray()) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        boolean flag = true;
        for (char a : str.toCharArray()) {
            if (map.get(a) % 2 != 0) {
                if (map.get(a) == 1) {
                    if (flag) {
                        flag = false;
                    } else {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
