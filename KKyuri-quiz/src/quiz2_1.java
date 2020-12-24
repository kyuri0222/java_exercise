//
//김규리 60185077
//

import java.util.Scanner;

public class quiz2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("빈칸 포함 문자열(영어/한글)을 입력하세요.");
		String string = scanner.nextLine();
		
		for(int i = 1; i <= string.length(); i++) {
			System.out.print(string.substring(i));
			System.out.println(string.substring(0, i));
		}
		scanner.close();
	}
}