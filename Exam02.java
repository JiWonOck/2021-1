import java.util.Scanner;
//대문자와 소문자 변환프로그램
public class Exam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String in, out = ""; //초기화 꼭 해주기
		char ch;
		int count, i;
		int diff = 'a'-'A';
		
		System.out.printf("문자열을 입력하세요 : ");
		in = s.nextLine();
		
		count = in.length();
		
		for(i=0; i<count; i++) {
			ch = in.charAt(i);
			if(('A'<=ch) && (ch<='Z'))
				out += (char) (ch+diff);
			else if (('a'<=ch) && (ch<='z'))
				out += (char) (ch-diff);
			else
				out += (char) ch;
		}
		System.out.printf("변환된 문자열 ==> %s", out);

	}

}
