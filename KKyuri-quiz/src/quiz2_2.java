//
//��Ը� 60185077
//

import java.util.*;
import java.io.*;

public class quiz2_2 {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\Runner\\effort.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		StringTokenizer st;
		
        int count = 0;
        String str = "";
        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            count += st.countTokens();
        }
    
        
        System.out.println("effort.txt.�� ���� ������ "+ count +"�Դϴ�.");

        fr.close();
        br.close();
	}
}