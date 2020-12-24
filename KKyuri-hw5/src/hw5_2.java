interface Shape {
   final double PI = 3.14; 
   void draw(); 
   double getArea(); 
   default public void redraw() { 
      System.out.print("--- 다시 그립니다.");
      draw();
   }
}

class Circle implements Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	public double getArea() {
		return PI*radius*radius;
	}
}

class Oval implements Shape {
	private int a,b;
	Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void draw() {
		System.out.println("장축x단축이 "+a + "x" + b + "인 타원입니다.");
	}
	public double getArea() {
		return (a / 2) * (b / 2) * PI;
	}
}

class Rect implements Shape {
	private int width, height;

	Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형 입니다.");
	}
	public double getArea() {
		return width * height;
	}
}

public class hw5_2 {
	public static void main(String[] args) {
		   Shape[] list = new Shape[3]; 
		   list[0] = new Circle(10); 
		   list[1] = new Oval(50, 40); 
		   list[2] = new Rect(10, 40); 
		   for(int i=0; i<list.length; i++)
			   list[i].redraw();
		   for(int i=0; i<list.length; i++)
			   System.out.println("면적은 "+ list[i].getArea());
		}
}