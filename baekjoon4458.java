package bronze3;

import java.util.Scanner;

public class baekjoon4458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		sc.nextLine();  // ������ ������ str�� ������ �ȵ��� ��
		String str;
		char first;
		
		for (int i = 0; i < count; i++) {
			str = sc.nextLine();
			first = Character.toUpperCase(str.charAt(0));
			str = str.substring(1);
			
			System.out.println(first + str);
			
		}
		
		sc.close();

	}

}
