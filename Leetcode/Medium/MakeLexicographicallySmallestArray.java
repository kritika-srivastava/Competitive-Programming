package Leetcode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MakeLexicographicallySmallestArray {
    /*public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length, temp = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i] && Math.abs(nums[j] - nums[i]) <= limit) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j = i;
                } else {
                }
               // System.out.println(i+" "+nums[i]+" "+nums[j]);
            }
        }

        return nums;
    }
    */
    public int[] lexicographicallySmallestArray(int[] arr, int threshold) {
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) sortedArr[i] = arr[i];
        Arrays.sort(sortedArr);

        int currentGroup = 0;
        HashMap<Integer, Integer> valueToGroup = new HashMap<>();
        valueToGroup.put(sortedArr[0], currentGroup);

        HashMap<Integer, LinkedList<Integer>> groupToValues = new HashMap<>();
        groupToValues.put(
            currentGroup,
            new LinkedList<Integer>(Arrays.asList(sortedArr[0]))
        );

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(sortedArr[i] - sortedArr[i - 1]) > threshold) {
                currentGroup++;
            }

            valueToGroup.put(sortedArr[i], currentGroup);

            if (!groupToValues.containsKey(currentGroup)) {
                groupToValues.put(currentGroup, new LinkedList<Integer>());
            }
            groupToValues.get(currentGroup).add(sortedArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int group = valueToGroup.get(value);
            arr[i] = groupToValues.get(group).pop();
        }

        return arr;
    }
}
