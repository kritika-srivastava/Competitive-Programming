package Leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\CourseSchedule4.java
 * @author Kritika Srivastava
 * @since January 27, 2025
 *
 * Link: https://leetcode.com/problems/course-schedule-iv/
 */

/*
 * @lc app=leetcode id=1462 lang=java
 *
 * [1462] Course Schedule IV
 */

// @lc code=start
public class CourseSchedule4 {

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        List<Boolean> ans = new ArrayList<Boolean>();

        // Initializing HashMap key-value with value i, null ArrayList
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<Integer>());
        }

        int n = prerequisites.length;

        // Add direct prerequisite courses
        for (int i = 0; i < n; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        // System.out.println(map);

        for (int i = 0; i < n; i++) {

            // adjacency list for course i
            ArrayList<Integer> preCourses = map.get(prerequisites[i][1]);

            Queue<Integer> preCourseList = new LinkedList<Integer>();
            boolean[] vis = new boolean[numCourses];

            preCourseList.add(prerequisites[i][0]);

            while (!preCourseList.isEmpty()) {

                int course = preCourseList.poll();

                if (!vis[course]) {
                    vis[course] = true;
                    if (!preCourses.contains(course)) {
                        preCourses.add(course);
                    }

                    preCourseList.addAll(map.get(course));
                } else {
                }
            }

            map.put(prerequisites[i][1], preCourses);

        }

        // System.out.println(map);

        int queryNum = queries.length;

        for (int i = 0; i < queryNum; i++) {
            ArrayList<Integer> courseListFinal = map.get(queries[i][1]);
            if (courseListFinal.contains(queries[i][0])) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}
// @lc code=end
