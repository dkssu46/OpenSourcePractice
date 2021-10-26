package Practice;

import java.util.*;

class Location {
	String name;
	int uido;
	int gdo;
}

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String srch;
		HashMap<String, Location> city = new HashMap<String, Location>();
		
		System.out.println("도시, 위도, 경도를 입력하세요");
		for(int i = 0;i < 4;i++) {
			Location a = new Location();
			String name;
			name = sc.next();
			a.name = name;
			a.uido = sc.nextInt();
			a.gdo = sc.nextInt();
			
			city.put(name, a);
		}
		
		System.out.println("---------------");
		
		Set<String> keys = city.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Location value = city.get(name);
			System.out.println(name + " " + value.uido + " " + value.gdo);
		}
		
		System.out.println("---------------");
		
		sc.nextLine();
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			srch = sc.nextLine();
			if(srch.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			Location there = city.get(srch);
			if(there != null)
				System.out.println(there.name + " " +there.uido + " " +there.gdo);
			else
				System.out.println("그런 도시는 없습니다");
		}
		
		
		sc.close();
		
		
		
		

	}

}
