//60185077 김규리 - 기초프로그래밍2 과제//
import java.io.*;
import java.util.*;

public class hw8 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String line = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String line2 = scanner.nextLine();
		
		String a,b;
		
		try {
			BufferedReader fr = new BufferedReader(new FileReader(new File(line)));
			BufferedReader fr2 = new BufferedReader(new FileReader(new File(line2)));
			FileWriter fw = new FileWriter(new File("append.txt"));
			while((a = fr.readLine()) != null) { 
				fw.write(a+"\n"); 
			}
			fr.close(); 
			
			while((b = fr2.readLine()) != null) { 
				fw.write(b+"\n"); 
			}
			fr2.close(); 
			fw.close();
			
			System.out.println("프로젝트 폴더 밑에 append.txt파일에 저장하였습니다.");
		} 
		
		catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
		scanner.close();
	}
}