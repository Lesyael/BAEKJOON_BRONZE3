package bronze3;

import java.util.Scanner;

public class baekjoon1085 {
	
	static void input (int var) {
		Scanner sc = new Scanner(System.in);
		
		var = sc.nextInt();
		
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		sc.close();
		
		if (x > w - x) {
			x = w - x;
		}
		
		if (y > h - y) {
			y = h - y;
		}
		
		if (x < y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
		

	}

}
