import java.util.Scanner;
public class Multiply {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.print(n+"x",+m+"="+n*m);
        
        scanner.close();
	}

}
