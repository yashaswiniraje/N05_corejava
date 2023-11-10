package org.dsa.array;

class LargestElement {

    public void largest(int arr[], int n) {
    	int largest=arr.length-1;
    	
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
           
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest= j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        
            System.out.println(arr[largest]);
            System.out.println(arr[0]);
    }

    public static void main(String[] args) {
    	LargestElement compute = new LargestElement();
    	
        int[] arr = {1, 8, 7, 56, 90};
        compute.largest(arr, arr.length);
        
    }
}