import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {

	LinkedList<String> ll = new LinkedList<String>();

	ll.add("���");
	ll.add("�ٳ���");
	System.out.println(ll);

	ll.addFirst("��");
	ll.addLast("���ξ���");
	System.out.println(ll);

	ll.add(2, "����");
	System.out.println(ll);

	ll.clear();
	System.out.println(ll);

	ll.offer("��"); System.out.println(ll);
	ll.offer("�䳢"); System.out.println(ll);
	ll.offer("�Ҵ�"); System.out.println(ll);
	ll.offer("�����"); System.out.println(ll);

	while( ! ll.isEmpty() )
		System.out.println( ll.poll( ) );
	}
}