import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("��"); System.out.println(s);
		s.push("����"); System.out.println(s);
		s.push("����"); System.out.println(s);
		s.push("�ܿ�"); System.out.println(s);
		System.out.println();
		
		System.out.println( s.peek() );
		System.out.println(s);
		System.out.println( );
		
		while( !s.empty() )
			System.out.print( s.pop() + " / ");
	}
}