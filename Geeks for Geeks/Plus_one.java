/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Plus_one.java
 * 
 * @author Kritika Srivastava
 * @since July 03, 2021
 *
 *        Link - https://practice.geeksforgeeks.org/problems/plus-one/1
 */
class Plus_one {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {

        if (arr.get(arr.size() - 1) < 9) {
            arr.set(arr.size() - 1, arr.get(arr.size() - 1) + 1);
        } else {
            int carry = 0;
            for (int i = arr.size() - 1; i >= 0; i--) {
                if (arr.get(i) == 9) {
                    arr.set(i, 0);
                    carry = 1;
                } else {
                    arr.set(i, arr.get(i) + 1);
                    carry = 0;
                    break;
                }
            }
            if (carry == 1) {
                arr.add(0, 1);
            }
        }
        return arr;
    }
};