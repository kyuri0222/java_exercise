import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {

	HashSet<String> set = new HashSet<String>();

	String animals[] = {"개", "토끼", "팬더", "고양이"};
	for(String s: animals)
	set.add(s);
	System.out.println(set);

	set.add("고양이");
	set.add("개");
	set.remove("팬더");
	for(String s: set)
		System.out.print(s + " / ");
	}
}