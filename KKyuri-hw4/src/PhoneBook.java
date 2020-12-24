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
      System.out.print("인원수 >> ");
      int num = scanner.nextInt();
      Phone [] phone = new Phone[num];
      
      for(i=0; i<num; i++) {
         System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
         String name = scanner.next();
         String tel = scanner.next();
         phone[i] = new Phone(name, tel);
      }
      
      System.out.println("저장되었습니다...");
      
      while(true) {
         System.out.print("검색할 이름 >>");
         String name = scanner.next();
    
         if(name.equals("그만"))
        	 break;
         
         for(i=0; i<num; i++) {
            if(name.equals(phone[i].getName())) {
               System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
               break;
            }
         }

         if (i == num) 
        	 System.out.println(name+"이 없습니다.");
      }
      scanner.close();
   }
}