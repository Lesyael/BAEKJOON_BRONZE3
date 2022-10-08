package bronze3;

import java.util.Scanner;

public class baekjoon2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int music = sc.nextInt();
		int average = sc.nextInt();
		
		sc.close();
		
		System.out.println((music * (average - 1)) + 1);

	}

}
