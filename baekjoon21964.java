package bronze3;

import java.util.Scanner;

public class baekjoon21964 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 

		 @SuppressWarnings("unused")
		int n = sc.nextInt();
	     String s = sc.next();
	     
	     sc.close();
	     
	     char[] c  = new char[5];
	     String[] str = new String[5];

	     for (int i =0 ; i <= 4; i++) {
	         c[i] = s.charAt(s.length()-i-1);
	         str[i] = String.valueOf(c[i]);
	         
	     }

	     for (int i =3 ; i >=0; i--) {
	         str[4] += str[i];
	         
	     }

	     System.out.println(str[4]);

	}

}
