import java.util.Scanner;

public class SubjectScore {
	public static void main(String[] args) {
		String course[] = {"Java", "Phthon", "AI", "OS", "Algorithm"};
		int score[] = {95, 88, 76, 62, 55};
		int i=0;
				
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�����̸� >> ");	
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;				
			for(i=0;i<5;i++) {
				if(course[i].equals(name)) {
					System.out.println(name+ "�� ������ " + score[i]);break;
				}
			}
			if(i==5) 
				System.out.println("���� �����Դϴ�."); 	
		}
		scanner.close();		
	}
}