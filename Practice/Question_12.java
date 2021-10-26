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
		
		dic.add(new Word("�Ʊ�", "Baby"));
		dic.add(new Word("���", "Love"));
		dic.add(new Word("��", "Bear"));
		dic.add(new Word("�ΰ�", "Human"));
		dic.add(new Word("����", "Earth"));
		dic.add(new Word("�ٺ�", "Babo"));
		dic.add(new Word("�ڹ�", "Java"));
		dic.add(new Word("���", "Language"));
		
		
		System.out.println("<��ǰ����>�� �ܾ� �׽�Ʈ�� �����մϴ�.");
		System.out.println("���� " + dic.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� >>");
			System.out.println("(1) �׽�Ʈ   (2) �ܾ� �߰�   (3) ����");
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
					System.out.print("(-1) ���� >>");
				
					int answer = sc.nextInt();
				
					if(answer == -1)
						break;
				
					if(answer == (ran3+1)) {
						System.out.println("�����Դϴ�!");
					}
					else
						System.out.println("Ʋ�Ƚ��ϴ�!");
				}
			
				System.out.println("�����մϴ�.");
				break;
			case 2:
				while(true) {
				System.out.println("�ܾ �߰����ּ���, �׸��� �Է��ϸ� �����մϴ� >>");
				String one = sc.next();
				if(one.equals("�׸�"))
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
