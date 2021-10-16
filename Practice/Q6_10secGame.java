package Practice;

import java.util.Scanner;
import java.util.Calendar;

class gamer {
	public int start;
	public int end;
	public int timegap;
	
	public void getScore() {
		if(end < start)
			end = end + 60;		
		
		timegap =  Math.abs(end-start);
	}
	
	public int getGap() {
		return Math.abs(10-timegap);
	}
}




public class Q6_10secGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		gamer a = new gamer();
		gamer b = new gamer();
		
		String temp;
		
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키 >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		a.start = now.get(Calendar.SECOND);
		System.out.println("     현재 초 시간 : " + a.start);
		System.out.print("10초 예상 후 <Enter>키 >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		a.end = now.get(Calendar.SECOND);
		System.out.println("     현재 초 시간 : " + a.end);
		
		System.out.print("이재문 시작 <Enter>키 >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		b.start = now.get(Calendar.SECOND);
		System.out.println("     현재 초 시간 : " + b.start);
		System.out.print("10초 예상 후 <Enter>키 >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		b.end = now.get(Calendar.SECOND);
		System.out.println("     현재 초 시간 : " + b.end);
		
		a.getScore();
		b.getScore();

		
		System.out.print("황기태의 결과 " + a.timegap + ", 이재문의 결과 " + b.timegap);
		if(a.getGap() > b.getGap())
			System.out.println(", 승자는 이재문");
		if(a.getGap() < b.getGap())
			System.out.println(", 승자는 황기태");
		if(a.getGap() == b.getGap())
			System.out.println(", 동점");
		
		
		sc.close();
	}

}
