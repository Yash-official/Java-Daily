import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println(stringConcat("apple", "orange"));
    }

    public static String stringConcat(String input1, String input2) {
        HashSet<Character> map = new HashSet<>();
        for (char c : input1.toCharArray()) {
            map.add(c);
        }
        for (char c : input2.toCharArray()) {
            map.add(c);
        }
        ArrayList<Character> a = new ArrayList<>();
        for (Character character : map) {
            a.add(character);
        }
        Collections.sort(a, Collections.reverseOrder());
        StringBuffer str = new StringBuffer();
        for (char c : a) {
            str.append(c);
        }

        return str.toString();
    }
}