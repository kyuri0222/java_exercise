import java.util.Scanner;

public class score {
		public static void main(String[] args) {
			System.out.print("�̸�, �����, �����, ���м����� �Է��Ͻÿ�.");
			char grade;			
			Scanner scanner = new Scanner(System.in);

			
			String name = scanner.next();
			int korean = scanner.nextInt();
			int english = scanner.nextInt();
			int math = scanner.nextInt();
			
			int sum = korean + english + math;
			int avg = sum/3;
			
			if(avg>=90)
				grade = '��';
			else if(avg>=90)
				grade = '��';
			else if(avg>=80)
				grade = '��';
			else if(avg>=70)
				grade = '��';
			else if(avg>60)
				grade = '��';
			
			System.out.println("������" + grade + "�Դϴ�.");
			scanner.close();			
	}
}
