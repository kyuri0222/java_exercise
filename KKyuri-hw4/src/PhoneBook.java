import java.util.Scanner;

class Phone {
   String name;
   String tel;
   
   public Phone(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   public String getName() {
      return name;
   }
   public String getTel() {
      return tel;
   }
}

public class PhoneBook {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int i;
      System.out.print("�ο��� >> ");
      int num = scanner.nextInt();
      Phone [] phone = new Phone[num];
      
      for(i=0; i<num; i++) {
         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
         String name = scanner.next();
         String tel = scanner.next();
         phone[i] = new Phone(name, tel);
      }
      
      System.out.println("����Ǿ����ϴ�...");
      
      while(true) {
         System.out.print("�˻��� �̸� >>");
         String name = scanner.next();
    
         if(name.equals("�׸�"))
        	 break;
         
         for(i=0; i<num; i++) {
            if(name.equals(phone[i].getName())) {
               System.out.println(name+"�� ��ȣ�� "+phone[i].getTel()+" �Դϴ�.");
               break;
            }
         }

         if (i == num) 
        	 System.out.println(name+"�� �����ϴ�.");
      }
      scanner.close();
   }
}