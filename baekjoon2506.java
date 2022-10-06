package bronze3;

import java.util.Scanner;

public class baekjoon2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            
            if (a == 1) {
                count++;
                sum += count;
            } else {
            	count = 0;
            }
            
        }
        
        sc.close();
        
        System.out.print(sum);
		
	}

}
