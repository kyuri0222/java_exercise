import java.util.Scanner;

class Point {
   private int x, y;
   public Point(int x, int y) { this.x = x; this.y = y; }
   public int getX() { return x; }
   public int getY() { return y; }
   protected void move(int x, int y) { this.x =x; this.y = y; }
}

class PositivePoint extends Point {
	   public PositivePoint() {
	      super(0, 0);
	   }
	   public PositivePoint(int x, int y) {
	      super(x,y);
	      if(x<0 || y<0) {
	         super.move(0,0);
	      }
	   }
	   protected void move(int x, int y) {
	      if(x>0 && y>0) {
	         super.move(x, y);
	      }
	   }
	   public String toString() {
	      String tmp = "("+getX()+","+getY()+")�� ��";
	      return tmp;
	   }
	   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �ʱⰪ x,y �Է�: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		PositivePoint p = new PositivePoint();
		p.move(x,y);
		System.out.println("��(0,0)�����߽��ϴ�.");
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�̵��� ��ǥ x,y �Է�: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		p.move(x1,y1); 
		System.out.println("("+x1+","+y1+")"+"�� �̵��߽��ϴ�.");
		}	   
	}
