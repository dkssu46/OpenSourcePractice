package Practice;

import java.util.Scanner;

class game12 {	
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

public class Q12_BigSlot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gamer;
		boolean winner = false;
		
		System.out.print("참여할 인원 >> ");
		gamer = sc.nextInt();
		sc.nextLine();
		
		
		game12[] z = new game12[gamer];
		for(int i = 0; i< gamer;i++) {
			z[i] = new game12();
		}
		
		for(int i = 0;i < gamer;i++) {
			System.out.print((i+1) + "번째 선수 이름 >>");
			z[i].name = sc.nextLine();
		}
		

		
		while(true) {
			for(int i = 0; i < gamer;i++) {
				z[i].tern();
				if(z[i].win) {
					winner = true;
					break;
				}
			}
			if(winner)
				break;
		}
		
		
		
		
		sc.close();

	}

}
