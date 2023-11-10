package org.dsa.array;

public class RemoveDuplicates {
	
	    public void arr(int[] nums) {
	    	
	    	int n=nums.length;
	    	for(int i=0;i<n;i++) {
	    	for(int j=i+1;j<n;j++) {	
	    		if(nums[i]==nums[j]){
	    			nums[i]=-1;
	    		}
	    	}
	    	
	    	}
	    	for(int i=0;i<n;i++) {
	    		if(nums[i]>0) {
	    			System.out.println(nums[i]);
	    		}
	    	}
			
	        
	        
	    }
	

	public static void main(String[] args) {
		int nums[]= {1,1,2,2,5,3,5,3};
		RemoveDuplicates r=new RemoveDuplicates();
		r.arr(nums);

	}

}
