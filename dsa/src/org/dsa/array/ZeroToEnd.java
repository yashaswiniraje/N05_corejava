package org.dsa.array;

public class ZeroToEnd {
static void movezeros(int arr[]) {
	
   
    for(int i=0;i<arr.length-1;i++) {
    	if(arr[i]==0)
    	{
    	   int temp=arr[i];
    	   arr[i]=arr[i+1];
    	   arr[i+1]=temp;
    		
    	}
    	
     }
  
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
}
}
	public static void main(String[] args) {
		int arr[]= {0,0,8,6,0};
		movezeros(arr);

	}

}
