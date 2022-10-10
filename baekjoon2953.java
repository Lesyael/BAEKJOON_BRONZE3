package bronze3;

import java.util.Scanner;

public class baekjoon2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0, count = 0, score[] = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 4; j++) {
				score[i] += sc.nextInt();
				
			}
			
			if (max < score[i]) {
				max = score[i];
				count = i + 1;
				
			}
			
		}
		
		sc.close();
		
		System.out.println(count + " " + max);

	}

}
