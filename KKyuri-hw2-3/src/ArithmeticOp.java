import java.util.Scanner;
public class ArithmeticOp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����� >> ");		
		double a = scanner.nextDouble();
		String operator = scanner.next();
		double b = scanner.nextDouble();
		
		switch (operator) {
		case "+":
			System.out.println(a + operator + b + "�� ��� ����� " + (a+b)); break;
		case "-":
			System.out.println(a + operator + b + "�� ��� ����� " + (a-b));  break;
		case "*":
			System.out.println(a + operator + b + "�� ��� ����� " + (a*b));  break;
		case "/":
			if (b == 0) {
				System.out.println("0���� ���� �� �����ϴ�."); break;
			}
			else { 
				System.out.println(a + operator + b + "�� ��� ����� " + (a/b)); break;
			}
			
		case "%":
			System.out.println(a + operator + b + "�� ��� ����� " + (a%b));  break;
		case "@":
			System.out.println(a + operator + b + "�� ��� ����� " + (int)(a/b));  break;
		}
		scanner.close();
	}
}