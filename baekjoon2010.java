package bronze3;

import java.util.Scanner;

public class baekjoon2010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int plug = sc.nextInt();
		
		for (int i = 1; i < count; i++) {
			plug += (sc.nextInt() - 1);
			
		}
		
		sc.close();
		
		System.out.println(plug);
		

	}

}
