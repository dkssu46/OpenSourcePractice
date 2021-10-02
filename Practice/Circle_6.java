import java.util.Scanner;

class Circle {
	private double x, y;
	public int radius;
	
	public Circle() {
		this(0,0,0);
	}
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("가장 큰 면적인 원은 (" + x + "," + y + ") " + radius);
	}
}


public class Circle_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 3;
		Circle c[] = new Circle[n];
		
		for(int i=0;i < n;i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int rad = sc.nextInt();
			c[i] = new Circle(x,y,rad);
		}
		
		int index = 0;
		int max = 0;
		
		for(int i = 0;i < n;i++) {
			if(c[i].radius > max) {
				index = i;
				max = c[i].radius;
			}
		}
		
		c[index].show();
		
		sc.close();

	}

}
