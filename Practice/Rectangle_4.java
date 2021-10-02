
public class Rectangle_4 {
	
	public static class Rectangle {
		int x;
		int y;
		int width;
		int height;
		
		public Rectangle() {
			this(0,0,0,0);
		}
		
		public Rectangle(int a, int b, int c, int d) {
			this.x = a;
			this.y = b;
			this.width = c;
			this.height = d;
		}
		
		public int square() {
			return width * height;
		}
		
		public void show() {
			System.out.println("(" + x + "," + y + ") ���� ũ�Ⱑ" + width + "x" + height + "�� �簢��");
		}
		
		public boolean contains(Rectangle a) {
			if(this.x <= a.x && this.y <= a.y)
				if(this.x + this.width >= a.x + a.width && this.y + this.height >= a.y + a.height)
					return true;
			
			return false;
		}
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");

	}

}
