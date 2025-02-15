package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ProductOfTheLastKNumbers.java
 * 
 * @author Kritika Srivastava
 * @since February 15, 2025
 *
 *        Link : https://leetcode.com/problems/find-the-punishment-number-of-an-integer/
 */
class PunishmentNumberOfInteger {
    public int punishmentNumber(int n) {
        int totalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(square, i)) {
                totalSum += square;
            }
        }
        
        return totalSum;
    }

    private boolean canPartition(int num, int target) {
        String numStr = String.valueOf(num);
        return partition(numStr, target, 0, 0);
    }

    private boolean partition(String numStr, int target, int index, int currentSum) {
        if (index == numStr.length()) {
            return currentSum == target;
        }
        
        int partialNum = 0;
        
        for (int i = index; i < numStr.length(); i++) {
            partialNum = partialNum * 10 + (numStr.charAt(i) - '0');
            if (partition(numStr, target, i + 1, currentSum + partialNum)) {
                return true;
            }
        }
        
        return false;
    }
}
