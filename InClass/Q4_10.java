class Sample {
	
	public int a;
	private int b;
	int c;

}



public class Q4_10 {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10;	// Private, 컴파일 에러
		aClass.c = 10;
		}
}
