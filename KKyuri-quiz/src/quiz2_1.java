//
//��Ը� 60185077
//

import java.util.Scanner;

public class quiz2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ĭ ���� ���ڿ�(����/�ѱ�)�� �Է��ϼ���.");
		String string = scanner.nextLine();
		
		for(int i = 1; i <= string.length(); i++) {
			System.out.print(string.substring(i));
			System.out.println(string.substring(0, i));
		}
		scanner.close();
	}
}