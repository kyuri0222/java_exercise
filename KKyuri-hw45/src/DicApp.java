import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "��", "�̷�", "�Ҹ�", "���", "����" };
	private static String [] eng = { "dream", "future", "hope", "love", "faith" };
	public static String kor2Eng(String word) {
		
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		String word;
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word = scanner.next();
			
			if(word.equals("�׸�")) {break;}
			String result = Dictionary.kor2Eng(word);
			if(result==(null))
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			else
				System.out.println(word+"�� "+result);
		}
		scanner.close();
	}
}
