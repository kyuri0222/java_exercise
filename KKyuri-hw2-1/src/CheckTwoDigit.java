import java.util.Scanner;

public class CheckTwoDigit {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("2�ڸ� ���� �Է�(10~99) >> ");
		int number = scanner.nextInt();
		
		if(number/10 == number%10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� " + number/10 + "�� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		
	scanner.close();
	}
}
