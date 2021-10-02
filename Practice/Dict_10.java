import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng = {"love","baby","money","future","hope"};
	
	public static String kor2eng(String w) {
		for(int i = 0;i < kor.length;i++) {
			if(w.equals(kor[i])) {
				return kor[i] + "��" + eng[i];
			}
		}
		return w + "�� ���� ������ �����ϴ�.";
	}
}

public class Dict_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String find = " ";
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(!find.equals("�׸�")) {
			System.out.print("�ѱ� �ܾ�? >>");
			find = sc.next();
			if(!find.equals("�׸�"))
				System.out.println(Dictionary.kor2eng(find));
		}
		
		sc.close();
		
	}

}
