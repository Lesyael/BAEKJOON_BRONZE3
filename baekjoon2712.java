package bronze3;

import java.util.Scanner;

public class baekjoon2712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		float num;
		String unit;
		
		for (int i = 0; i < count; i++) {
			num = sc.nextFloat();
			unit = sc.next();
			
			if (unit.equals("kg")) {
				System.out.println(String.format("%.4f", num * 2.2046) + " lb");
			} else if (unit.equals("lb")) {
				System.out.println(String.format("%.4f", num * 0.4536) + " kg");
			} else if (unit.equals("l")) {
				System.out.println(String.format("%.4f", num * 0.2642) + " g");
			} else if (unit.equals("g")) {
				System.out.println(String.format("%.4f", num * 3.7854) + " l");
			}
			
		}
		
		sc.close();

	}

}
