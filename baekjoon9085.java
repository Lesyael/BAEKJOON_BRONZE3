package bronze3;

import java.util.Scanner;

public class baekjoon9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCount = sc.nextInt();
		int numCount;
		int sum;
		
		for (int i = 0; i < caseCount; i++) {
			numCount = sc.nextInt();
			sum = 0;
			
			for (int j = 0; j < numCount; j++) {
				sum += sc.nextInt();
				
			}
			
			System.out.println(sum);
			
		}
		
		sc.close();

	}

}
