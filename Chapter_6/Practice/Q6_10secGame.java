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
		
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <Enter>Ű >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		a.start = now.get(Calendar.SECOND);
		System.out.println("     ���� �� �ð� : " + a.start);
		System.out.print("10�� ���� �� <Enter>Ű >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		a.end = now.get(Calendar.SECOND);
		System.out.println("     ���� �� �ð� : " + a.end);
		
		System.out.print("���繮 ���� <Enter>Ű >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		b.start = now.get(Calendar.SECOND);
		System.out.println("     ���� �� �ð� : " + b.start);
		System.out.print("10�� ���� �� <Enter>Ű >>");
		temp = sc.nextLine();
		now.clear();
		now = Calendar.getInstance();
		b.end = now.get(Calendar.SECOND);
		System.out.println("     ���� �� �ð� : " + b.end);
		
		a.getScore();
		b.getScore();

		
		System.out.print("Ȳ������ ��� " + a.timegap + ", ���繮�� ��� " + b.timegap);
		if(a.getGap() > b.getGap())
			System.out.println(", ���ڴ� ���繮");
		if(a.getGap() < b.getGap())
			System.out.println(", ���ڴ� Ȳ����");
		if(a.getGap() == b.getGap())
			System.out.println(", ����");
		
		
		sc.close();
	}

}
