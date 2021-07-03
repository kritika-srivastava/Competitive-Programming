/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Gray_code.java
 * 
 * @author Kritika Srivastava
 * @since July 02, 2021
 *
 *        Link - https://leetcode.com/problems/gray-code/
 */
public class Gray_code {
    public List<Integer> grayCode(int n) {
        LinkedList<Integer> l = new LinkedList<Integer>();

        for (int i = 0; i < Math.pow(2, n); i++) {

            l.add(i ^ i >> 1);
        }

        return l;
    }

}
