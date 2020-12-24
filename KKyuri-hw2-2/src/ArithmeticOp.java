import java.util.Scanner;

public class ArithmeticOp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����� >> ");		
		double a = scanner.nextDouble();
		String operator = scanner.next();
		double b = scanner.nextDouble();
		
		if (operator.equals("+"))
			System.out.println(a + operator + b + "�� ��� ����� " + (a+b));
		
		else if (operator.equals("-"))
			System.out.println(a + operator + b + "�� ��� ����� " + (a-b));
		
		else if (operator.equals("*"))
			System.out.println(a + operator + b + "�� ��� ����� " + (a*b));
		
		else if (operator.equals("/")) {
			if (b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");				
			else
				System.out.println(a + operator + b + "�� ��� ����� " + (a/b));
		}
		
		else if (operator.equals("%")) 
			System.out.println(a + operator + b + "�� ��� ����� " + (a%b));
		
		else if (operator.equals("@"))
			System.out.println(a + operator + b + "�� ��� ����� " + (int)(a/b));
				
		scanner.close();
	}
}