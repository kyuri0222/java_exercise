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
	      String tmp = "("+getX()+","+getY()+")의 점";
	      return tmp;
	   }
	   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점의 초기값 x,y 입력: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		PositivePoint p = new PositivePoint();
		p.move(x,y);
		System.out.println("점(0,0)생성했습니다.");
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("이동할 좌표 x,y 입력: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		p.move(x1,y1); 
		System.out.println("("+x1+","+y1+")"+"로 이동했습니다.");
		}	   
	}
