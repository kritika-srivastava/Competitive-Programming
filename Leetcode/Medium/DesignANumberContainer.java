package Leetcode.Medium;

import java.util.HashMap;
import java.util.TreeSet;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\DesignANumberContainer.java
 * @author Kritika Srivastava
 * @since February 08, 2025
 *
 * Link: https://leetcode.com/problems/design-a-number-container-system/
 */
public class DesignANumberContainer {

    HashMap<Integer, Integer> containers;
    HashMap<Integer, TreeSet<Integer>> indices;

    public NumberContainers() {
        containers = new HashMap<>();
        indices = new HashMap<>();
    }

    public void change(int index, int number) {

        if (containers.containsKey(index)) {
            int prevNum = containers.get(index);

            TreeSet<Integer> numIndices = indices.get(prevNum);
            numIndices.remove(Integer.valueOf(index));
            indices.put(prevNum, numIndices);
        } else {
        }
        containers.put(index, number);

        if (!indices.containsKey(number)) {
            TreeSet<Integer> newIndices = new TreeSet<Integer>();
            newIndices.add(index);
            indices.put(number, newIndices);
        } else {
            TreeSet<Integer> newIndices = indices.get(number);
            newIndices.add(index);
            indices.put(number, newIndices);
        }

    }

    public int find(int number) {
        int minIndex = Integer.MAX_VALUE;
        if (!indices.containsKey(number)) {
            return -1;
        }
        TreeSet<Integer> numIndices = indices.get(number);
        if (numIndices.size() == 0) {
        } else {
            for (int i : numIndices) {
                minIndex = Math.min(minIndex, i);
                break;
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }

    /**
     * Your NumberContainers object will be instantiated and called as such:
     * NumberContainers obj = new NumberContainers();
     * obj.change(index,number);
     * int param_2 = obj.find(number);
     */
}
