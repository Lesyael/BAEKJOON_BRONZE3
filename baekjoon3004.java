package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon3004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int piece = 1, a = 1;
		
		for(int i = 0; i < count; i++){
            if (i % 2 != 0){
                a += 1;
            }
            
            piece += a;
            
        }
		
        System.out.println(piece);

	}

}
