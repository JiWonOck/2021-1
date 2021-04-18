import java.util.Scanner;

//입력한 문자열의 종류 구분
public class Ch07_254p_ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt = 0, lower_cnt=0, digit_cnt=0;	//대문자, 소문자, 숫자 개수 초기화
		int i;
		
		System.out.printf("문자열을 입력 : ");
		str = s.nextLine();
		
		i=0;
		do {
			ch = str.charAt(i);
			
			if ('A'<= ch && ch <='Z')
				upper_cnt++;
			if ('a'<= ch && ch <='z')
				lower_cnt++;
			if ('0'<= ch && ch <='9')
				digit_cnt++;
			
			i++;
		} while (i < str.length());
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자%d개\n", upper_cnt, lower_cnt, digit_cnt);
	}

}
