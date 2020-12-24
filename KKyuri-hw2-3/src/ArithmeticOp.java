import java.util.Scanner;
public class ArithmeticOp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("연산식 >> ");		
		double a = scanner.nextDouble();
		String operator = scanner.next();
		double b = scanner.nextDouble();
		
		switch (operator) {
		case "+":
			System.out.println(a + operator + b + "의 계산 결과는 " + (a+b)); break;
		case "-":
			System.out.println(a + operator + b + "의 계산 결과는 " + (a-b));  break;
		case "*":
			System.out.println(a + operator + b + "의 계산 결과는 " + (a*b));  break;
		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다."); break;
			}
			else { 
				System.out.println(a + operator + b + "의 계산 결과는 " + (a/b)); break;
			}
			
		case "%":
			System.out.println(a + operator + b + "의 계산 결과는 " + (a%b));  break;
		case "@":
			System.out.println(a + operator + b + "의 계산 결과는 " + (int)(a/b));  break;
		}
		scanner.close();
	}
}