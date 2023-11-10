package org.dsa.array;
public class RemovalOfElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize a variable to keep track of the number of elements not equal to val
        
        // Iterate through the array with a pointer i
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it to the k-th position and increment k
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};
        
        RemovalOfElement remover = new  RemovalOfElement();
        int k = remover.removeElement(nums, val);
        
        System.out.println("Length after removal: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        // You can add assertion checks here to verify the result against expectedNums
        // assert k == expectedNums.length;
        // for (int i = 0; i < k; i++) {
        //     assert nums[i] == expectedNums[i];
        // }
    }
}
