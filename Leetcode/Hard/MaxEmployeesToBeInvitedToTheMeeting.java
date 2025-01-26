/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Hard\MaxEmployeesToBeInvitedToTheMeeting.java
 * @author Kritika Srivastava
 * @since January 26, 2025
 *
 * Link: https://leetcode.com/problems/maximum-employees-to-be-invited-to-a-meeting/
 */
public class MaxEmployeesToBeInvitedToTheMeeting {
        public int maximumInvitations(int[] preferences) {
            int n = preferences.length;
            List<List<Integer>> graph = new ArrayList<>(n);
    
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
    
            for (int i = 0; i < n; i++) {
                graph.get(preferences[i]).add(i);
            }
    
            int longestCycle = 0;
            int twoCycleSum = 0;
            boolean[] seen = new boolean[n];
    
            for (int i = 0; i < n; i++) {
                if (!seen[i]) {
                    Map<Integer, Integer> tracking = new HashMap<>();
                    int curr = i;
                    int dist = 0;
    
                    while (true) {
                        if (seen[curr]) break;
                        seen[curr] = true;
                        tracking.put(curr, dist++);
                        int next = preferences[curr];
    
                        if (tracking.containsKey(next)) {
                            int cycleLen = dist - tracking.get(next);
                            longestCycle = Math.max(longestCycle, cycleLen);
    
                            if (cycleLen == 2) {
                                Set<Integer> visited = new HashSet<>();
                                visited.add(curr);
                                visited.add(next);
                                twoCycleSum += 2 + calculateDistance(next, visited, graph) + calculateDistance(curr, visited, graph);
                            }
                            break;
                        }
    
                        curr = next;
                    }
                }
            }
    
            return Math.max(longestCycle, twoCycleSum);
        }
        static int calculateDistance(int start, Set<Integer> visited, List<List<Integer>> graph) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[] { start, 0 });
            int maxDist = 0;
    
            while (!queue.isEmpty()) {
                int[] node = queue.poll();
                int currNode = node[0];
                int currDist = node[1];
    
                for (int neighbor : graph.get(currNode)) {
                    if (visited.contains(neighbor)) continue;
                    visited.add(neighbor);
                    queue.offer(new int[] { neighbor, currDist + 1 });
                    maxDist = Math.max(maxDist, currDist + 1);
                }
            }
    
            return maxDist;
        }
}
