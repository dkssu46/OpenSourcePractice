import java.util.Scanner;

class Hall {
	static String Sseat[] = {"--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ",};
	static String Aseat[] = {"--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ",};
	static String Bseat[] = {"--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ",};

	public static void book() {
		Scanner sc = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3) >>>");
		int n = sc.nextInt();
		String name;
		int num;
		switch(n) {
		case 1:
			show(1);
			System.out.print("이름 >> ");
			name = sc.next();
			System.out.print("좌석번호 >> ");
			num = sc.nextInt();
			Sseat[num-1] = name;
			break;
		case 2:
			show(2);
			System.out.print("이름 >> ");
			name = sc.next();
			System.out.print("좌석번호 >> ");
			num = sc.nextInt();
			Aseat[num-1] = name;
			break;
		case 3:
			show(3);
			System.out.print("이름 >> ");
			name = sc.next();
			System.out.print("좌석번호 >> ");
			num = sc.nextInt();
			Bseat[num-1] = name;
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
	
	public static void check() {
		for(int i = 0;i < 3;i++) {
			show(i+1);
			System.out.println("");
		}
	}
	
	public static void cancle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3) >>>");
		int n = sc.nextInt();
		String name;
		switch(n) {
		case 1:
			show(1);
			System.out.print("이름 >> ");
			name = sc.next();
			for(int i = 0;i < 10;i++) {
				if(Sseat[i].equals(name)) {
					Sseat[i] = "--- ";
				}
			}
			break;
		case 2:
			show(2);
			System.out.print("이름 >> ");
			name = sc.next();
			for(int i = 0;i < 10;i++) {
				if(Aseat[i].equals(name)) {
					Aseat[i] = "--- ";
				}
			}
			break;
		case 3:
			show(3);
			System.out.print("이름 >> ");
			name = sc.next();
			for(int i = 0;i < 10;i++) {
				if(Bseat[i].equals(name)) {
					Bseat[i] = "--- ";
				}
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
	
	public static void show(int a) {
		switch(a) {
		case 1:
			System.out.print("S >>");
			for(int i = 0;i < 10;i++)
				System.out.print(Sseat[i]);
			break;
		case 2:
			System.out.print("A >>");
			for(int i = 0;i < 10;i++)
				System.out.print(Aseat[i]);
			break;
		case 3:
			System.out.print("B >>");
			for(int i = 0;i < 10;i++)
				System.out.print(Bseat[i]);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}

}


public class Concert_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(!(key == 4)) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
			key = sc.nextInt();
			
			switch(key) {
			case 1:
				Hall.book();
				break;
			case 2:
				Hall.check();
				break;
			case 3:
				Hall.cancle();
				break;
			case 4:
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}
		sc.close();
	}
}
