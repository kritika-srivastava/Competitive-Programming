import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * E:\GithubProjects\Competitive-Programming\CSES\StaticRangeSumQueries.java
 * @author Kritika Srivastava
 * @since December 14, 2024
 *
 * URL: https://cses.fi/problemset/task/1646/
 */
public class StaticRangeSumQueries {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for input and BufferedWriter for output
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // Reading the first line: n (number of elements) and q (number of queries)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        // Array to store cumulative sums
        long[] cumulativeSum = new long[n];
        long sum = 0;
        
        // Read the elements and compute cumulative sums
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Long.parseLong(st.nextToken());
            cumulativeSum[i] = sum;
        }
        
        // Read and process the queries
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken()) - 1; // Convert to 0-based index
            int right = Integer.parseInt(st.nextToken()) - 1; // Convert to 0-based index
            
            // Calculate the range sum
            if (left == 0) {
                bw.write(cumulativeSum[right] + "\n");
            } else {
                bw.write((cumulativeSum[right] - cumulativeSum[left - 1]) + "\n");
            }
        }
        
        // Flush the output buffer to ensure everything is written at once
        bw.flush();
    }
}
