import java.util.Scanner;
public class Backwards {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("���ܾ �Է��ϼ��� : ");
	String word = scanner.next();
	scanner.nextLine();
	char[] arr = word.toCharArray();

	System.out.print("�Ųٷ� �� �ܾ��: ");
	for (int i =  arr.length -1; i>=0; i--) {
		System.out.print(arr[i]);
	}
	scanner.close();
}
}