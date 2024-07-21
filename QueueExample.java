package Array;

import java.util.Scanner;

public class QueueExample {
	public static void main(String[] args) {    
  		System.out.println("Here is my 10th Total with average and grades");
        result();
    		
}
    	
    	static void result() {
			Scanner sc = new Scanner(System.in);
      	  int results = sc.nextInt();
      		int[] arr = new int[results];
      		
  		int total = 0; int mark = 0;
      	for(int i = 0; i < arr.length; i++) {
      		 mark = sc.nextInt();
      		total += mark;
      		
      	}
    
      System.out.println("Total marks : " + total);
      System.out.println("Average of"+ " " + total + " : " + total/arr.length + " Avg");
      
     if(mark <= 34) {
    	 
    	 System.out.println("Fail");}
     else {
      if(total >= 500 && total >= 450) {
    		 System.out.println("Congrates A GRADE");
    	 }
    	    	
      else if(total >= 400 && total >= 350) {
    	  System.out.println("It is B GRADE");
      }
      
      else if(total >= 300 && total >= 349) {
    	  System.out.println("C GRADE");
      }
      else {
    	  System.out.println("D GRADE");
      }}
  
    	}
        
}


