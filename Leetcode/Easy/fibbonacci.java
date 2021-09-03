/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/fibbonacci.java
 * 
 * @author Kritika Srivastava
 * @since September 03, 2021
 *
 *        Link - https://leetcode.com/problems/fibonacci-number/
 */
public class fibbonacci {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
