import java.util.Scanner;
public class Alphabet {
		public static void main(String[] args) {
			System.out.print("소문자 알파벳 하나를 입력하시오");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.next();
			
			char c = s.charAt(0);
			
			System.out.println();
			
			scanner.close();			
		}
}