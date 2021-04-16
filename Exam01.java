import java.util.Scanner;

//입력된 문자열 거꾸로 출력하기
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ss;						//문자열 ss, tt선언, tt는 ""로 초기화
		String tt = "";
		int count, i;
		
		System.out.printf("문자열을 입력하세요 : ");
		ss = s.nextLine();				//문자열 입력
		
		count = ss.length();			//입력받은 문자의 개수(문자열의 길이)를 구함
		
		for (i=0; i<count; i++) {		//문자열의 개수만큼 반복해서 tt에 입력받은 문자열을 거꾸로 저장
			tt += ss.charAt(count-(i+1));
		}
		
		System.out.printf("내용을 거꾸로 출력 ==> %s", tt);

	}

}
