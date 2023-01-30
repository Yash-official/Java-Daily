import java.util.Arrays;

class FindTotalShops {
    public static void main(String[] args) {
        for (int n : findTotalShops(5, new int[] { 3, 10, 8, 6, 11 }, 4, new int[] { 1, 10, 3, 11 })) {
            System.out.print(n + " ");
        }
    }

    public static int[] findTotalShops(int input1, int[] input2, int input3, int[] input4) {
        int[] ans = new int[input3];
        Arrays.sort(input2);
        for (int i = 0; i < input3; i++) {
            int count = 0;
            for (int k = 0; k < input2.length; k++) {
                if (input4[i] >= input2[k]) {
                    count += 1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}