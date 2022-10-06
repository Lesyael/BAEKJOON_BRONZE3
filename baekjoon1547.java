package bronze3;

import java.util.Scanner;

public class baekjoon1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int cup = 1;
		
		for (int i = 0, x, y; i < count; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (cup == x || cup == y) {
				cup = x + y - cup;
			}
			
		}
		
		sc.close();
		
		System.out.println(cup);
		
	}

}
