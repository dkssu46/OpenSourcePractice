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
		
		System.out.print("�ο��� >> ");
		n = sc.nextInt();
		
		Phone phonebook[] = new Phone[n];
		
		for(int i = 0;i < n;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ĭ���� �Է�) >>");
			String name = sc.next();
			String number = sc.next();
			phonebook[i] = new Phone(name, number);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		String find = " ";
		int f = 0;
		
		
		while(!find.equals("�׸�")) {
			System.out.print("�˻��� �̸� >>");
			find = sc.next();
			f = 0;
			for(int i = 0;i < n;i++) {
				if(find.equals(phonebook[i].name)) {
					System.out.println(phonebook[i].name + "�� ��ȣ�� " + phonebook[i].number + "�Դϴ�.");
					f = 1;
				}
			}
			if(f == 0 && !find.equals("�׸�")) {
				System.out.println(find + "��� ����� �����ϴ�");
			}
			
		}
		
		sc.close();

	}

}
