import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {

	LinkedList<String> ll = new LinkedList<String>();

	ll.add("사과");
	ll.add("바나나");
	System.out.println(ll);

	ll.addFirst("배");
	ll.addLast("파인애플");
	System.out.println(ll);

	ll.add(2, "망고");
	System.out.println(ll);

	ll.clear();
	System.out.println(ll);

	ll.offer("개"); System.out.println(ll);
	ll.offer("토끼"); System.out.println(ll);
	ll.offer("팬더"); System.out.println(ll);
	ll.offer("고양이"); System.out.println(ll);

	while( ! ll.isEmpty() )
		System.out.println( ll.poll( ) );
	}
}