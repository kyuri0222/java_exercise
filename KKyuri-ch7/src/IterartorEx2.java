import java.util.*;

public class IterartorEx2 {
	public static void main(String[] args) {
		HashSet<Integer> iset = new HashSet<Integer>();
		
		iset.add(5);
		iset.add(4);
		iset.add(-1);
		iset.add(9);
		iset.add(-7);
		System.out.println(iset);

		Iterator<Integer> it = iset.iterator();
		while( it.hasNext() ) {
			if ( it.next() < 0)
			it.remove();
		}
		System.out.println(iset);

		int sum = 0;
		it = iset.iterator(); 
		while( it.hasNext() ) {
			int n = it.next();
			sum += n;
		}
		System.out.println("집합에 있는 양의 정수 합 : "+ sum);
	}
}