package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array A[] of n numbers and another number x, the
 * task is to check whether there exist two elements in
 * A[] whose sum is exactly x
 * Url: https://leetcode.com/problems/two-sum/
 * */

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15}; // 9
        int target = 9;
        System.out.println(twoSum(arr, target));
    }

    private static boolean twoSum(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(target - i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
}
