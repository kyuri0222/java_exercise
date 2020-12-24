//
// 김규리 60185077
//

import java.util.*;

public class Final1 {

 public static void main(String[] args) {

  ArrayList<String> arrayList = new ArrayList<String>();

  arrayList.add("배");
  arrayList.add("사과");
  arrayList.add("수박");
  arrayList.add("바나나");
  arrayList.add("체리");
  arrayList.add("복숭아");
  arrayList.add("망고");
  arrayList.add("파인애플");
  
  Iterator <String> it = arrayList.iterator();
  while(it.hasNext()) {
	  String s = it.next();
	  System.out.println(s);
  }
}
}