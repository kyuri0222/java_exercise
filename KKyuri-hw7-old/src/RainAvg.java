import java.util.Scanner;
import java.util.*;

public class RainAvg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n == 0)
				break;
			v.add(n);
			
			int avg =0;
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i)+" ");
				avg += v.get(i);
			}
			System.out.println();
			avg /= v.size();
			System.out.println("현재 평균 "+avg);
		}
		scanner.close();
	}
}