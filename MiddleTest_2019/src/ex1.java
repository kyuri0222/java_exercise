import java.util.Scanner;
class ex1 {
	int hr1,min1,total,hr2,min2;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ð��� ���� �Է��Ͻÿ� >>");
		int hr1 = scanner.nextInt();
		int min1 = scanner.nextInt();
		int total = hr1*60+min1-45;
		
		int hr2=total/60;
		int min2=total%60;
		
		System.out.print("45������ "+hr2+"�� "+min2+"�� �Դϴ�.");
		scanner.close();		
	}

}
