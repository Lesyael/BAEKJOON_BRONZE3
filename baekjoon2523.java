package bronze3;

import java.util.Scanner;

public class baekjoon2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        sc.close();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
           }
        for (int i = 1; i < n; i++) {
        	for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            
        }
			
	}

}
