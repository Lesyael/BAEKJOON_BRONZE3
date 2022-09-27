package bronze3;

import java.util.Scanner;

public class baekjoon2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        sc.close();

        for (int i = 0; i < 2 * n - 1; i++){
            if (i < n) {
                for (int j = 0; j < i; j++) {
                	 System.out.print(" ");
                }

                for (int j = 0; j < (n - i) * 2 - 1; j++) {
                	System.out.print("*");
                }

                System.out.println();
                
            } else {
                for (int j = 0; j < 2 * (n - 1) - i; j++) {
                	System.out.print(" ");
                }

                for (int j = 0; j < (i + 1 - n) * 2 + 1; j++) {
                	System.out.print("*");
                }

                System.out.println();

            }
            
        }
        
	}
	
}
