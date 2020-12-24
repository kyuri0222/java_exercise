import java.util.Scanner;

public class score {
		public static void main(String[] args) {
			System.out.print("이름, 국어성적, 영어성적, 수학성적을 입력하시오.");
			char grade;			
			Scanner scanner = new Scanner(System.in);

			
			String name = scanner.next();
			int korean = scanner.nextInt();
			int english = scanner.nextInt();
			int math = scanner.nextInt();
			
			int sum = korean + english + math;
			int avg = sum/3;
			
			if(avg>=90)
				grade = '수';
			else if(avg>=90)
				grade = '우';
			else if(avg>=80)
				grade = '미';
			else if(avg>=70)
				grade = '양';
			else if(avg>60)
				grade = '가';
			
			System.out.println("학점은" + grade + "입니다.");
			scanner.close();			
	}
}
