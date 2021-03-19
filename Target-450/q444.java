import java.io.*;

class q444 {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            System.out.println(findPosition(N));
        }
    }

    static int findPosition(int N) {
        String m = Integer.toBinaryString(N);
        int i = 0, flag = 0, pos = 0;
        for (i = 0; i < m.length(); i++) {
            if (m.charAt(i) == '1') {
                flag++;
                pos = i;
            } else {
            }
        }
        if (flag==1) {
            return m.length() - pos;
        } else {
        }
        return -1;
    }
}
