// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

class Soltion {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        // int k = s.nextInt();
        int count = 1;
        while (t-- > 0) {

            int n = s.nextInt();
            long c = s.nextLong();

            HashMap<Long, Long> mp = new HashMap<Long, Long>();
            int a[][] = new int[n][2];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (long j = a[i][0] + 1; j < a[i][1]; j++) {
                    if (mp.containsKey(j)) {
                        mp.put(j, mp.get(j) + 1);
                    } else {
                        mp.put(j, (long) 1);
                    }
                }
            }

            LinkedList<Long> mm = new LinkedList<Long>();
            long cc = c;

            Map<Long, Long> map = sortByValue(mp);
            int k = 0;
            // for (Map.Entry<Long, Long> en : map.entrySet()) {
            // System.out.println("K,V = " + en.getKey() + " " + en.getValue());

            // }
            for (Map.Entry<Long, Long> en : map.entrySet()) {
                k++;
                if (map.size() - k < c) {
                    if (cc > 0) {
                        mm.add(en.getKey());
                        cc--;
                    } else {
                        break;
                    }
                }

            }
            long nn = (long) n;
            for (Long j : mm) {

                for (int i = 0; i < n; i++) {
                    if (j > a[i][0] && j < a[i][1]) {
                        nn++;
                    } else {
                    }
                }
            }

            System.out.println("Case #" + count + ": " + nn);
            count++;
        }

    }

    public static HashMap<Long, Long> sortByValue(HashMap<Long, Long> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<Long, Long>> list = new LinkedList<Map.Entry<Long, Long>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Long, Long>>() {
            public int compare(Map.Entry<Long, Long> o1, Map.Entry<Long, Long> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Long, Long> temp = new LinkedHashMap<Long, Long>();
        for (Map.Entry<Long, Long> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
