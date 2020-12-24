import java.util.Scanner;

class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width*height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	public boolean contains(Rectangle r) {
		if((this.x<r.x) && (this.y<r.y) && (this.x+this.width)
				>(r.x+r.width) && (this.y+this.height)>(r.y+r.height))
			return true;
		else
			return false;
	}
}

public class RectangleApp {
	
	public static void main(String args[]) {
		Rectangle rA = new Rectangle(2, 2, 8, 7);
		Rectangle rB = new Rectangle(5, 5, 6, 6);
		Rectangle rC = new Rectangle(1, 1, 10, 10);
		
		rA.show(); 
		rB.show();
		rC.show();
		System.out.println("rA�� ������ "+rA.square());
		System.out.println("rB�� ������ "+rB.square());
		System.out.println("rC�� ������ "+rC.square());
		if(rC.contains(rA)) System.out.println("rC�� rA�� �����մϴ�.");
		if(rC.contains(rB)) System.out.println("rC�� rB�� �����մϴ�.");
	}
}