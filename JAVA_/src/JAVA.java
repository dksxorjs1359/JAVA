import java.util.Scanner;//스캐너불러오기
public class JAVA {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);//스캐너 변수 이름 생성?
	System.out.printf("첫번째 숫자를 입력하세요");
	int num1=sc.nextInt();//int 함수1=스캐너 불러오기
	System.out.printf("두번째 숫자를 입력하세요");
	int num2=sc.nextInt();//int 함수2=입력함수 불러오기
	int num3=num1+num2;//num1+num2=num3이라는 함수 생성 
	System.out.printf("정답은%d",num3);
	sc.close();
	}

}
