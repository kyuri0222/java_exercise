import java.util.*;

public class CountLetter {
	static String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");		
		while(true) {
			String line=scanner.nextLine();
			if(line.length() == 1 && line.charAt(0)==';')
				break;
			sb.append(line);
		}
		return sb.toString();
		
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] alphaArr = new int [26];
		String alpha = readString();
		
		for(int i=0; i<alpha.length(); i++) {
			if(alpha.charAt(i) >= 'a' && alpha.charAt(i) <='z') alphaArr[alpha.charAt(i)-97]++;
			if(alpha.charAt(i) >= 'A' && alpha.charAt(i) <='Z') alphaArr[alpha.charAt(i)-65]++;
		}
		System.out.println("<알파벳의 사용 빈도>"); 	
		for(int i=0; i<alphaArr.length; i++) {
			System.out.printf("%s(%d) ",(char)(i+65),alphaArr[i]);
		}
		scanner.close();
	}
	
}