package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, count = 0;
		int result[] = new int[2];
		String str;
		
		for(int i = 0; i < 9; i++) {
			str = br.readLine();
			num = Integer.parseInt(str);
			count++;
			
			if (result[0] < num) {
				result[0] = num;
				result[1] = count;
			}
			
		}
		
		System.out.println(result[0] + "\n" + result[1]);

	}

}
