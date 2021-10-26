package Practice;

import java.util.*;

abstract class Shape {
	public void draw() {
		System.out.print("shape ");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.print("Circle ");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.print("Line ");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.print("Rect ");
	}
}


public class Question_10 {

	public static void main(String[] args) {
		Vector<Shape> ob = new Vector<Shape>();
		Scanner sc = new Scanner(System.in);
		int key;
		
		System.out.println("그래픽 에디터를 실행합니다");
		while(true) {
			System.out.print("삽입(1)  삭제(2)  보기(3)  종료(4) >>");
			key = sc.nextInt();
			
			if(key == 4)
				break;
			
			int key2;
			switch(key) {
			case 1:
				System.out.print("Line(1)  Rect(2)  Circle(3)>>");
				key2 = sc.nextInt();
				switch(key2) {
				case 1:
					ob.add(new Line());
					break;
				case 2:
					ob.add(new Rect());
					break;
				case 3:
					ob.add(new Circle());
					break;
				}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >>");
				key2 = sc.nextInt();
				if(key2 < ob.size())
					ob.remove(key2);
				else
					System.out.println("삭제할 수 없습니다.");
				break;
			case 3:
				Iterator<Shape> it = ob.iterator();
				while(it.hasNext())
					it.next().draw();
				System.out.println();
				break;
			}
			
		}

	}

}
