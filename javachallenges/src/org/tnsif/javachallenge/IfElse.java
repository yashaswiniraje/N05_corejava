package org.tnsif.javachallenge;
import java.util.Scanner;
public class IfElse {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
	
	 int N=sc.nextInt();
     
      if(N%2!=0 ){
          System.out.println("Weird");
      }
      else if(N%2==0 && 2<=N && N<=5){
          System.out.println(" Not Weird");
      }
      else if(N%2==0 && 6<=N && N<=20){
          System.out.println(" Weird");
      }
      else if(N%2==0 &&  N>20){
          System.out.println(" Not Weird");
      }
}
}
