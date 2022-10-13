package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int cute = 0, notcute = 0;
		
		for (int i = 0, cheak; i < count; i++) {
			cheak = Integer.parseInt(br.readLine());
			
			if (cheak == 1) {
				cute++;
			} else {
				notcute++;
			}
			
		}
		
		if (cute > notcute) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}

	}

}
