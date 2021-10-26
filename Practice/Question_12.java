package Practice;

import java.util.*;

class Word {
	String kor;
	String eng;
	
	public Word(String a, String b) {
		this.kor = a;
		this.eng = b;
	}
}

public class Question_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Word> dic = new Vector<Word>();
		
		String solve[] = new String[4];
		int check[] = new int[4];
		
		for(int i = 0;i < 4;i++) {
			solve[i] = new String();
		}
		
		dic.add(new Word("아기", "Baby"));
		dic.add(new Word("사랑", "Love"));
		dic.add(new Word("곰", "Bear"));
		dic.add(new Word("인간", "Human"));
		dic.add(new Word("지구", "Earth"));
		dic.add(new Word("바보", "Babo"));
		dic.add(new Word("자바", "Java"));
		dic.add(new Word("언어", "Language"));
		
		
		System.out.println("<명품영어>의 단어 테스트를 시작합니다.");
		System.out.println("현재 " + dic.size() + "개의 단어가 들어 있습니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요 >>");
			System.out.println("(1) 테스트   (2) 단어 추가   (3) 종료");
			int key = sc.nextInt();
			
			if(key == 3)
				break;
			
			switch(key) {
			case 1:
				while(true) {
					int ran = (int)(Math.random()*100)%(dic.size());
				
					System.out.println(dic.get(ran).eng + "? >");
				
				
					for(int i = 0;i < 4;i++) {
						int ran2 = (int)(Math.random()*100)%(dic.size());
						check[i] = ran2;
						for(int j = 0;j < i;j++) {
							if(ran2 == check[j])
								ran2 = (int)(Math.random()*100)%(dic.size());
						}
						solve[i] = dic.get(ran2).kor;
					}
				
					for(int i = 0;i < 4;i++) {
						if(check[i] == ran) {
							solve[i] = dic.get((int)(Math.random()*100)%(dic.size())).kor;
						}
					}
				
					int ran3 = (int)(Math.random()*100)%4;
					solve[ran3] = dic.get(ran).kor;
				
					for(int i = 0;i < 4;i++) {
						System.out.print("(" + (i+1) + ")" + solve[i] + " ");
					}
					System.out.print("(-1) 종료 >>");
				
					int answer = sc.nextInt();
				
					if(answer == -1)
						break;
				
					if(answer == (ran3+1)) {
						System.out.println("정답입니다!");
					}
					else
						System.out.println("틀렸습니다!");
				}
			
				System.out.println("종료합니다.");
				break;
			case 2:
				while(true) {
				System.out.println("단어를 추가해주세요, 그만을 입력하면 종료합니다 >>");
				String one = sc.next();
				if(one.equals("그만"))
					break;
				String two = sc.next();
				dic.add(new Word(one,two));
				}
				break;
			
			}
				
			
		}
			
			
		sc.close();
	}

}
