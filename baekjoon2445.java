package bronze3;

import java.util.Scanner;

public class baekjoon2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		sc.close();
		
		for (int i = count - 1; i >= 0 ; i--) {
			for (int j = 0; j < count - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i * 2 - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i = 1; i <= count ; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= i * 2 - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
