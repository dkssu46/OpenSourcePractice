package Practice;

import java.util.*;

public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> cust = new HashMap<String, Integer>();
		
		String name;
		int point;
		
		System.out.println("포인트 관리 프로그램입니다.");
		
		while(true) {
			System.out.print("이름과 포인트 입력 >>");
			name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			point = sc.nextInt();
			sc.nextLine();
			
			
			
			Set<String> keys = cust.keySet();
			Iterator<String> it = keys.iterator();
			
			int count = 0;
			while(it.hasNext()) {
				if(name.equals(it.next())) {
					String one = name;
					int two = cust.get(name);
					two += point;
					cust.remove(name);
					cust.put(one, two);
					count = 1;
					break;
				}
			}
			
			if(count == 0) {
				cust.put(name, point);
			}
			
			it = keys.iterator();			
			while(it.hasNext()) {
				String one = it.next();
				int value = cust.get(one);
				System.out.println("( " + one + " , " + value + " )");
			}
			
			
		}

	}

}
