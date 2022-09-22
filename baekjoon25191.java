package bronze3;

import java.util.Scanner;

public class baekjoon25191 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		sc.close();
		
		for(int i = 0; i < count; i++) { 
            
            for(int j = count - i; j < count; j++) {
            
                System.out.print(" ");     
                
            }         
            
            for(int k = i; k < count; k++) {
                
                System.out.print("*");
                
            }            
                     
            System.out.println();
            
        }
		
	}

}
