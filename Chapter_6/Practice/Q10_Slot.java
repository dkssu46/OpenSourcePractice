package Practice;

import java.util.Scanner;

class game {	
	String name;
	boolean win = false;
	
	int[] num = new int[3];
	
	void tern() {
		Scanner scan = new Scanner(System.in);
		String temp;
		System.out.print("[" + name + "] : <Enter>");
		temp = scan.nextLine();
		slot();
		System.out.print("   " + num[0] + "   " + num[1] + "   " + num[2]);
		if(num[0] == num[1]) {
			if(num[1] == num[2]) {
				System.out.println("  " + name + "님이 이겼습니다!");
				win = true;

				return;
			}
		}
		
		System.out.println("  아쉽군요!");
	}
	
	void slot() {
		for(int i = 0;i < 3;i++) {
			num[i] = (int)(Math.random()*100)%3 + 1;
		}
	}
}

public class Q10_Slot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		game a = new game();
		game b = new game();
		
		System.out.print("1번째 선수 이름 >>");
		a.name = sc.nextLine();
		System.out.print("2번째 선수 이름 >>");
		b.name = sc.nextLine();
		
		while(true) {
			a.tern();
			if(a.win)
				break;
			
			b.tern();
			if(b.win)
				break;
		}
		
		
		
		
		sc.close();

	}

}
