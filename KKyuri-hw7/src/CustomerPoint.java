import java.util.*;

public class CustomerPoint {
	public static void main(String[] args) {
		HashMap <String,Integer> PointAdmin = new HashMap<String,Integer>(); 
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>>");
			
			String name = scanner.next();
			Integer point = scanner.nextInt();
			
			if(name.equals("�׸�")) break;
			else
				PointAdmin.put(name,point);
				
			Set<String> keys = PointAdmin.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()){
				String name2 = it.next();
				int point2 = PointAdmin.get(name2);
				System.out.print("(" + name2 + ","+ point2 + ")");
			}
			System.out.println();
		}
	scanner.close();	
	}
}
