package random;
import java.util.Random;
import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();//랜덤함수
		System.out.println("가위바위보 게임에 오신것을 환영합니다.");
		System.out.print("가위바위보를 입력해주세요 :");
		String me=sc.next();
		int comChoice = random.nextInt(3);//랜덤으로 나올 숫자를 0,1,2 총 3가지로 제한
		String com="";//랜덤으로 나온 값을 저장
		
		if (comChoice == 0)//나온 숫자를 문자열로 대입
            com = "가위";
        else if (comChoice == 1)
            com = "바위";
        else if (comChoice == 2)
            com = "보";
		System.out.println("컴퓨터 출력 내용 : "+com);
		
		if(com.equals("주먹")) {;//random함수로 나온값과 문자열을 비교 
		if(me.equals("보"))//내가 무슨 문자를 작성했는지 
		System.out.println("승리");//이겼으면 승리
		
		else if(me.equals("가위"))
			System.out.println("패배");
		
		else if(me.equals("주먹"))
			System.out.println("비김");
		}
		if(com.equals("가위")) {;
		if(me.equals("주먹"))
		System.out.println("승리");
		
		else if(me.equals("보"))
			System.out.println("패배");
		
		else if(me.equals("가위"))
			System.out.println("비김");
	}
		if(com.equals("보")) {;
		if(me.equals("가위"))
		System.out.println("승리");
		
		else if(me.equals("주먹"))
			System.out.println("패배");
		
		else if(me.equals("보"))
			System.out.println("승리");
	}
}
}