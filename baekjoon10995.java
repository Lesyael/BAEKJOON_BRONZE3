package bronze3;

import java.util.Scanner;

public class baekjoon10995 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    sc.close();
	    
	    int m = 0;
	    
	    if (n == 1) {
	    	System.out.print("*");
	    } else {
	      for (int i = 1; i <= n; i++) {
	          for (int j = 1; j <= n; j++) {
	              if (i % 2 == 1) {
	                  if (m == 0) {
	                      System.out.print("*");
	                      m++;
	                      j++;
	                  }
	                  
	                  System.out.print(" *");
	                  
	              } else {
	                  System.out.print(" *");
	              }
	              
	          }
	          
	          m = 0;
	          System.out.println();
	          
	      }
	      
	    }

	}

}
