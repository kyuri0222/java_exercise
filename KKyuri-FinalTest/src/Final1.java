//
// ��Ը� 60185077
//

import java.util.*;

public class Final1 {

 public static void main(String[] args) {

  ArrayList<String> arrayList = new ArrayList<String>();

  arrayList.add("��");
  arrayList.add("���");
  arrayList.add("����");
  arrayList.add("�ٳ���");
  arrayList.add("ü��");
  arrayList.add("������");
  arrayList.add("����");
  arrayList.add("���ξ���");
  
  Iterator <String> it = arrayList.iterator();
  while(it.hasNext()) {
	  String s = it.next();
	  System.out.println(s);
  }
}
}