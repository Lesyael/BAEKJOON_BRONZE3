package bronze3;

import java.util.Scanner;

public class baekjoon2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, count1 = 0, count2;
		int result[] = new int[3];
		
		for (int i = 0; i < 9; i++) {
			count1++;
			count2 = 0;
			
			for (int j = 0; j < 9; j++) {
				count2++;
				num = sc.nextInt();
				
				if (result[0] < num) {
					result[0] = num;
					result[1] = count1;
					result[2] = count2;
				}
				
			}
			
		}
		
		sc.close();
		
		System.out.println(result[0] + "\n" + result[1] + " " + result[2]);

	}

}
