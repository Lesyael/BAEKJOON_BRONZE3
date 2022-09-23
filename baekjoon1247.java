package bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon1247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger zero = new BigInteger("0");
		int count, i = 3;
		while (i > 0) {
			BigInteger sum = zero;
			count = sc.nextInt();
			
			for (int j = 0; j < count; j++) {
				sum = sum.add(sc.nextBigInteger());
				
			}
			
			if (sum.compareTo(zero) == 1) {
				System.out.println("+");
			} else if (sum.compareTo(zero) == -1) {
				System.out.println("-");
			} else {
				System.out.println(0);
			}
			
			i--;
			
		}
		
		sc.close();

	}

}
