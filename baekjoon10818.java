package bronze3;

import java.util.Scanner;

public class baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int num;
		int min = sc.nextInt(), max = min;
		
		for (int i = 1; i < count; i++) {
			num = sc.nextInt();
			
			if (min > num) {
				min = num;
			} else if (max < num) {
				max = num;
			}
		}
		
		sc.close();
		
		System.out.println(min + " " + max);

	}

}
