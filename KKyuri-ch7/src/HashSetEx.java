import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {

	HashSet<String> set = new HashSet<String>();

	String animals[] = {"��", "�䳢", "�Ҵ�", "�����"};
	for(String s: animals)
	set.add(s);
	System.out.println(set);

	set.add("�����");
	set.add("��");
	set.remove("�Ҵ�");
	for(String s: set)
		System.out.print(s + " / ");
	}
}