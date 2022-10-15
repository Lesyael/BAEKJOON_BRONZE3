package bronze3;

import java.util.Scanner;

public class baekjoon10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();

		for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            for(int j = 0;  j < i + 1; j++) {
                System.out.print("*");
                
                if(j < i + 1) {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
            
        }
		
	}

}
