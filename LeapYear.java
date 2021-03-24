import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 입력받기
		Scanner in=new Scanner(System.in);
		int year;
		boolean isLeapYear;
		
		System.out.printf("연도를 입력하세요 : ");
		year = in.nextInt();
		
		isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		//삼항연산자 사용해서 출력하기
		System.out.printf(isLeapYear ? "윤년" : "윤년이 아님");
	
		
	}

}
