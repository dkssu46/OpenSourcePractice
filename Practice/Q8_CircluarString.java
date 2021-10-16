package Practice;

import java.util.Scanner;

public class Q8_CircluarString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st;
		
		System.out.println("문자열을 입력하세요.");
		
		st = sc.nextLine();
		
		for(int i = 0;i < st.length();i++) {
			for(int j = 0;j < st.length();j++) {
				System.out.print(st.charAt((i+j)%st.length()));
			}
			System.out.println();
		}
		System.out.println(st);
		
		
		sc.close();
	}

}
