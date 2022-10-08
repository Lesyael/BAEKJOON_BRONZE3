package bronze3;

import java.util.Scanner;

public class baekjoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time[] = new int[2];
		
		time[0] = sc.nextInt();
		time[1] = sc.nextInt();
		
		sc.close();
		
		time[1] -= 45;
		
		if (time[1] < 0) {
			time[1] += 60;
			time[0] -= 1;
		}
		
		if (time[0] < 0) {
			time[0] += 24;
		}
		
		System.out.println(time[0] + " " +time[1]);

	}

}
