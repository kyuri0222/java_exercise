import java.util.Scanner;
class ex1 {
	int hr1,min1,total,hr2,min2;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간과 분을 입력하시오 >>");
		int hr1 = scanner.nextInt();
		int min1 = scanner.nextInt();
		int total = hr1*60+min1-45;
		
		int hr2=total/60;
		int min2=total%60;
		
		System.out.print("45분전은 "+hr2+"시 "+min2+"분 입니다.");
		scanner.close();		
	}

}
