package org.dsa.array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + " " + j + "],"+target);
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
       twoSum(new int[]{2, 7, 11, 15}, 17); // Example usage
     
        }
    }

