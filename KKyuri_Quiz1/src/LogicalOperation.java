//
//��Ը� 60185077
//
import java.util.Scanner;
import java.util.InputMismatchException;

public class LogicalOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�� ������ �Է��ϼ���(��:true OR false) >> ");		
		
		
		boolean a = scanner.nextBoolean();
		String operator = scanner.next();
		boolean b = scanner.nextBoolean();			


		switch(operator) {

		case "AND":
			if(a==true && b==true)
				System.out.println("true");
			else
				System.out.println("false");
			break;
		case "OR":
			if(a==true || b==true)
				System.out.println("true");
			else
				System.out.println("false");
			break;
			
		}
	scanner.close();
	}
}
