package org.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);
        return result;
    }

    private static void generatePermutations(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            // Convert the current array to a List and add it to the result
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            // Swap the current element with the element at the index
            swap(nums, index, i);

            // Recursively generate permutations for the rest of the array
            generatePermutations(nums, index + 1, result);

            // Undo the swap to backtrack and explore other permutations
            swap(nums, index, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permute(arr);

        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

