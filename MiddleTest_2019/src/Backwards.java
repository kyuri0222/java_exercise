import java.util.Scanner;
public class Backwards {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("영단어를 입력하세요 : ");
	String word = scanner.next();
	scanner.nextLine();
	char[] arr = word.toCharArray();

	System.out.print("거꾸로 된 단어는: ");
	for (int i =  arr.length -1; i>=0; i--) {
		System.out.print(arr[i]);
	}
	scanner.close();
}
}