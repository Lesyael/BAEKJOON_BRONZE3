package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
       
        br.close();

        for (int i = 1; i <= num ; i++) {
            for (int k = 1; k <= (num - i); k++) {
                System.out.printf(" ");
            }

            for(int j = 1; j <= (2 * i - 1); j++) {
                if (i == num) {
                    System.out.printf("*");
                } else {
                    if(j == 1 || j == (2 * i - 1)) {                   
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                    
                }
                
            }
            
            System.out.printf("\n");
            
        }

	}

}
