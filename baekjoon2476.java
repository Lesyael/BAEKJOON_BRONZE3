package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			int money = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == b && b == c ) {
				money = 10000 + (a * 1000);
			}else if(a != b && b != c && a != c) {
				money = Math.max(a, Math.max(b, c)) * 100;
			}else {
				if(a == b || a == c) {
					money = 1000 + (a * 100);
				}else {
					money = 1000 + (b * 100);
				}
			}
			
			if(money > max) {
				max = money;
			}
			
		}
		
		System.out.println(max);

	}

}
