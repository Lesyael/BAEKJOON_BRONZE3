package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon2997 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3]; 
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int n = arr[1] - arr[0];
		int n2 = arr[2] - arr[1];

		if(n == n2) {
			System.out.println(arr[2] + n);
		}else if(n < n2) {
			System.out.println(arr[1] + n);
		}else {
			System.out.println(arr[0] + n2);
		}

	}

}
