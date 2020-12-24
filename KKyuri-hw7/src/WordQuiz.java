//20201112 �������α׷���2 Ʃ�͸� �ǽ� - 7�� ����å���� ����(�������� 12��)//
import java.util.*; 

class Word{
	  private String eng;  
	  private String kor;  
	  public Word(String eng, String kor) {
	    this.eng = eng; 
	    this.kor = kor; 
	  } 
	  public String getEng() {return eng;} 
	  public String getKor() {return kor;}
} 

public class WordQuiz { 
	  Scanner scanner = new Scanner(System.in); 
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); 
	    Word sample[] = new Word[4];
	    Word quizNum;
	    
	    var v = new Vector<Word>();
	    v.add(new Word("love", "���"));
	    v.add(new Word("animal", "����"));
	    v.add(new Word("dog", "������"));
	    v.add(new Word("cat", "�����"));
	    v.add(new Word("computer", "��ǻ��"));
	    v.add(new Word("bag", "����"));
	    v.add(new Word("book", "å"));
	    v.add(new Word("pencil", "����"));
	    v.add(new Word("cloth", "��"));
	    v.add(new Word("pants", "����"));
	    v.add(new Word("head", "�Ӹ�"));
	    v.add(new Word("hand", "��"));
	    v.add(new Word("foot", "��"));
	    v.add(new Word("arm", "��"));
	    v.add(new Word("cigarettes", "���"));
	    v.add(new Word("fire", "��"));
	    v.add(new Word("water", "��"));
	    
	    System.out.println("\"��ǰ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�."); 
	    
	    while(true) {
	    System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>>"); 
	    int n2 = Integer.parseInt(scanner.nextLine());
	    
	    /* 1. �ܾ� �׽�Ʈ */
    	if(n2 == 1) { 
    		System.out.println("���� " + v.size() + "���� �ܾ ��� �ֽ��ϴ�.-1�� �Է��ϸ� �����մϴ�."); 
    		
		    while(true) {
		    	Collections.shuffle(v);
		    	sample[0] = v.get(0);
		    	sample[1] = v.get(1);
		    	sample[2] = v.get(2);
		    	sample[3] = v.get(3);
		    	
		    	int random = (int)(Math.random()*4);
		    	quizNum = v.get(random);
		    	
		    	System.out.println(quizNum.getEng()+"?");
		    	System.out.printf("(1)%s (2)%s (3)%s (4)%s :>",sample[0].getKor(),sample[1].getKor(),sample[2].getKor(),sample[3].getKor());
		    	int n = Integer.parseInt(scanner.nextLine());
		    	
		    	if(n == -1) {
		    		System.out.println("\"��ǰ����\"�� �����մϴ�..."); 
		    		break;
		    	}
		    	
		    	else if (n>=1 && n<=4) {
			    	if(quizNum.getKor().equals(sample[n-1].getKor())) System.out.println("Excellent !!");
			    	else System.out.println("No. !!");
		    	}
		    	
		    	else {
		    		System.out.println("���ڸ� �Է��ϼ��� !!");
		    	}
		    	
		    	} 
    	}
    	
	    /* 2. �ܾ� ���� */
    	else if(n2 == 2) {
    		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");

    		while(true) {
    			System.out.print("���� �ѱ� �Է� >>");
    			String inserteng = scanner.next();
    			String insertkor = scanner.next();
    			
    			if(inserteng.equals("�׸�")) break;
    			
    			v.add(new Word(inserteng,insertkor));
    		}
    		
    	}
    	
    	/* 3. ����  */
    	else {
    		System.out.println("\"��ǰ����\"�� �����մϴ�..."); 
    	}
    	
	    scanner.close();
	    }
	  }
}
	