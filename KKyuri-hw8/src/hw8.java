//60185077 ��Ը� - �������α׷���2 ����//
import java.io.*;
import java.util.*;

public class hw8 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String line = scanner.nextLine();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
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
			
			System.out.println("������Ʈ ���� �ؿ� append.txt���Ͽ� �����Ͽ����ϴ�.");
		} 
		
		catch (IOException e) {
			System.out.println("���� ���� ����");
		}
		
		scanner.close();
	}
}