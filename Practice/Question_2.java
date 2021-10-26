package Practice;

import java.util.*;

public class Question_2 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력 >>");
		for(int i = 0;i < 6;i++) {
			String b = sc.next();
			a.add(b);
		}
		
		float score = 0;
		
		for(int i = 0;i < 6;i++) {
			switch(a.get(i)) {
			case "A":
				score += 4.0;
				break;
			case "B":
				score += 3.0;
				break;
			case "C":
				score += 2.0;
				break;
			case "D":
				score += 1.0;
				break;
			case "F":
				break;
				
			}
					
		}
		
		System.out.println(score/6);
		
		sc.close();
		
	}
}
