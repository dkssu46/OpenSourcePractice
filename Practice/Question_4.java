package Practice;

import java.util.*;

public class Question_4 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> rain = new Vector<Integer>();
		
		
		
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			
			int a = sc.nextInt();
			
			if(a == 0)
				break;
			
			rain.add(a);
			sum += a;
			Iterator<Integer> it = rain.iterator();
			while(it.hasNext()) {
				int n = it.next();
				System.out.print(n + " ");
			}
			System.out.println();
			
			int num = rain.size();
			

			System.out.println(sum/num);
		}

		sc.close();
	}

}
