package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MinimizeXOR.java
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 * Link - https://leetcode.com/problems/minimize-xor
 */
public class MinimizeXOR {
    public int minimizeXor(int a, int b) {
        int res = 0;

        int targetBits = Integer.bitCount(b);
        int count = 0;
        int bit = 31;

        while (count < targetBits) {
            if (checkBit(a, bit) || (targetBits - count > bit)) {
                res = enableBit(res, bit);
                count++;
            }
            bit--;
        }

        return res;
    }

    private boolean checkBit(int num, int pos) {
        return (num & (1 << pos)) != 0;
    }

    private int enableBit(int num, int pos) {
        return num | (1 << pos);
    }
}
