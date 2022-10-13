package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11024 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count1 = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count2 = st.countTokens();
			
			int sum = 0;
			
			for(int j = 0; j < count2; j++) {
				sum += Integer.parseInt(st.nextToken());
				
			}
			
			System.out.println(sum);
			
		}

	}

}
