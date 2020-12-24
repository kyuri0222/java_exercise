import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("봄"); System.out.println(s);
		s.push("여름"); System.out.println(s);
		s.push("가을"); System.out.println(s);
		s.push("겨울"); System.out.println(s);
		System.out.println();
		
		System.out.println( s.peek() );
		System.out.println(s);
		System.out.println( );
		
		while( !s.empty() )
			System.out.print( s.pop() + " / ");
	}
}