/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Excel_Sheet.java
 * 
 * @author Kritika Srivastava
 * @since June 03, 2021
 *
 *        Description - Given a string columnTitle that represents the column
 *        title as appear in an Excel sheet, return its corresponding column
 *        number. Link -
 *        https://leetcode.com/problems/excel-sheet-column-number/
 */
public class Excel_Sheet {
    public int titleToNumber(String columnTitle) {
        int ret = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            ret *= 26;
            ret += (int) columnTitle.charAt(i) - (int) 'A' + 1;
        }
        return ret;
    }
}
