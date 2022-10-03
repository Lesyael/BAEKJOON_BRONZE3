package bronze3;

import java.util.Scanner;

public class baekjoon1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int young = 0;
        int min = 0;
        int sec = 0;

        for (int i = 0; i < n; i++) {
            sec = sc.nextInt();
            young += ((sec / 30) + 1) * 10;
            min += ((sec / 60) + 1) * 15;
        }
        
        sc.close();

        if (young == min) {
            System.out.println("Y M " + young);
        } else if (young > min) {
            System.out.println("M " + min);
        } else if (young < min) {
            System.out.println("Y " + young);
        }

	}

}
