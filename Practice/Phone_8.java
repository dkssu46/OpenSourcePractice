import java.util.Scanner;

class Phone {
	public String name;
	public String number;
	
	public Phone() {
		this("","");
	}
	
	public Phone(String a, String b) {
		this.name = a;
		this.number = b;
	}
}

public class Phone_8 {
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("인원수 >> ");
		n = sc.nextInt();
		
		Phone phonebook[] = new Phone[n];
		
		for(int i = 0;i < n;i++) {
			System.out.print("이름과 전화번호(빈칸없이 입력) >>");
			String name = sc.next();
			String number = sc.next();
			phonebook[i] = new Phone(name, number);
		}
		System.out.println("저장되었습니다...");
		
		String find = " ";
		int f = 0;
		
		
		while(!find.equals("그만")) {
			System.out.print("검색할 이름 >>");
			find = sc.next();
			f = 0;
			for(int i = 0;i < n;i++) {
				if(find.equals(phonebook[i].name)) {
					System.out.println(phonebook[i].name + "의 번호는 " + phonebook[i].number + "입니다.");
					f = 1;
				}
			}
			if(f == 0 && !find.equals("그만")) {
				System.out.println(find + "라는 사람이 없습니다");
			}
			
		}
		
		sc.close();

	}

}
