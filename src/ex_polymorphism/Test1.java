package ex_polymorphism;

public class Test1 {
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		c.rad = 3;
		c.draw();
		
		
		Rectangle r = new Rectangle();
		r.line1 = 10;
		r.line2 = 20;
		r.draw();
		
		
		Triangle t = new Triangle();
		t.a = 10;
		t.b = 20;
		t.c = 30;
		t.draw();
		
		
		System.out.println("===============================");
		Shape s = c;
		s.draw();
		
		s = r;
		s.draw();
		
		s = t;
		s.draw();
		
		
		System.out.println("===============================");
		
		
		shapeDraw(c);
		shapeDraw(r);
		shapeDraw(t);
		
		
		System.out.println("================================");
		
		Circle c2 = new Circle();
		shapeDraw(c2);
		
	}	
//		
//	} public static void shapeDraw(Circle x) {
//		x.draw();
//	}public static void shapeDraw(Rectangle x) {
//		x.draw();
//	}public static void shapeDraw(Triangle x) {
//		x.draw();
//	}
//	
//	
	public static void shapeDraw(Shape s) {
		s.draw();
	}
	
	
	
	
}
class Shape {
	
	
	public void draw() {
		System.out.println("도형 그리기!");
		
	}
	
	
}
class Circle extends Shape{
	double rad;

	@Override
	public void draw() {
	System.out.println("반지름"+rad+"을 사용하여 원 그리기!");
	}
	
}

class Rectangle extends Shape{
	int line1;
	int line2;
	@Override
	public void draw() {
		System.out.println(line1+","+line2+" 직선 두 개 사용하여 사각형 그리기!");
	}
	
	
}
class Triangle extends Shape{
	int a;
	int b;
	int c;
	@Override
	public void draw() {
		System.out.println(a +","+ b+"," + c + " 꼭지점 세 개 사용하여 삼각형 그리기!");
	}
	
	
	
}