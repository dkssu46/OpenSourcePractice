import java.util.Scanner;

public class Grade_2 {
	
	public static class Grade {
		public int math;
		public int science;
		public int english;
		
		public Grade() {
			this(0,0,0);
		}
		
		public Grade(int a, int b, int c) {
			this.math = a;
			this.science = b;
			this.english = c;
		}
		
		public int average() {
			return (math+science+english) / 3;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("�����" + me.average());
		
		scanner.close();
	}

}
