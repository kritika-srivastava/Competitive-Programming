import java.util.*;

public class Q1 {
    static List<Long> getDistanceMetrices(List<Integer> arr) {
        List<Long> l = new ArrayList<Long>();
        for (int i = 0; i < arr.size(); i++) {
            long tmp = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    tmp += Math.abs(j - i);
                }
            }
            l.add(tmp);
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        List<Long> l = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            arr.add(kb.nextInt());
        }
        l = getDistanceMetrices(arr);
        for (int i = 0; i < n; i++) {
            System.out.println("Out " + l.get(i));
        }
    }
}