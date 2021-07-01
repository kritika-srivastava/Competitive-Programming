import java.util.Scanner;

class Sum_of_twoInt {
    static int getSum(int a, int b) {
        System.out.println(b == 0 ? a : getSum(a ^ b, (a & b) << 1));
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(getSum(a, b));

    }
}
// @lc code=end
