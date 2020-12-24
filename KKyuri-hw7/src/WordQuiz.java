//20201112 기초프로그래밍2 튜터링 실습 - 7장 오픈책린지 수정(연습문제 12번)//
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
	    v.add(new Word("love", "사랑"));
	    v.add(new Word("animal", "동물"));
	    v.add(new Word("dog", "강아지"));
	    v.add(new Word("cat", "고양이"));
	    v.add(new Word("computer", "컴퓨터"));
	    v.add(new Word("bag", "가방"));
	    v.add(new Word("book", "책"));
	    v.add(new Word("pencil", "연필"));
	    v.add(new Word("cloth", "옷"));
	    v.add(new Word("pants", "바지"));
	    v.add(new Word("head", "머리"));
	    v.add(new Word("hand", "손"));
	    v.add(new Word("foot", "발"));
	    v.add(new Word("arm", "팔"));
	    v.add(new Word("cigarettes", "담배"));
	    v.add(new Word("fire", "불"));
	    v.add(new Word("water", "물"));
	    
	    System.out.println("\"명품영어\"의 단어 테스트를 시작합니다."); 
	    
	    while(true) {
	    System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>>"); 
	    int n2 = Integer.parseInt(scanner.nextLine());
	    
	    /* 1. 단어 테스트 */
    	if(n2 == 1) { 
    		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.-1을 입력하면 종료합니다."); 
    		
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
		    		System.out.println("\"명품영어\"를 종료합니다..."); 
		    		break;
		    	}
		    	
		    	else if (n>=1 && n<=4) {
			    	if(quizNum.getKor().equals(sample[n-1].getKor())) System.out.println("Excellent !!");
			    	else System.out.println("No. !!");
		    	}
		    	
		    	else {
		    		System.out.println("숫자를 입력하세요 !!");
		    	}
		    	
		    	} 
    	}
    	
	    /* 2. 단어 삽입 */
    	else if(n2 == 2) {
    		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");

    		while(true) {
    			System.out.print("영어 한글 입력 >>");
    			String inserteng = scanner.next();
    			String insertkor = scanner.next();
    			
    			if(inserteng.equals("그만")) break;
    			
    			v.add(new Word(inserteng,insertkor));
    		}
    		
    	}
    	
    	/* 3. 종료  */
    	else {
    		System.out.println("\"명품영어\"를 종료합니다..."); 
    	}
    	
	    scanner.close();
	    }
	  }
}
	