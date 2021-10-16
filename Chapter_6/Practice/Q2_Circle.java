package Practice;

class Circle {
	int x;
	int y;
	int radius;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ") ������" + radius;
	}
	
	public boolean equals(Circle a) {
		if(this.x == a.x) {
			if(this.y == a.y)
				return true;
		}
		
		return false;
	}
}


public class Q2_Circle {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
				

	}

}
