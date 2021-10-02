import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	
	public static String kor2eng(String w) {
		for(int i = 0;i < kor.length;i++) {
			if(w.equals(kor[i])) {
				return kor[i] + "은" + eng[i];
			}
		}
		return w + "는 저의 사전에 없습니다.";
	}
}

public class Dict_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String find = " ";
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(!find.equals("그만")) {
			System.out.print("한글 단어? >>");
			find = sc.next();
			if(!find.equals("그만"))
				System.out.println(Dictionary.kor2eng(find));
		}
		
		sc.close();
		
	}

}
