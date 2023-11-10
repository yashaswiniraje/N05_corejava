package org.dsa.array;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 3, 2};
        PivotIndex pivotIndexFinder = new PivotIndex();
        int pivot = pivotIndexFinder.pivotIndex(arr);
        if (pivot != -1) {
            System.out.println("Pivot index is: " + pivot);
        } else {
            System.out.println("No pivot index found.");
        }
    }
}
