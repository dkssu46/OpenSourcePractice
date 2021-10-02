
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
			System.out.println("(" + x + "," + y + ") 에서 크기가" + width + "x" + height + "인 사각형");
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
		System.out.println("s의 면적은" + s.square());
		
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

	}

}
