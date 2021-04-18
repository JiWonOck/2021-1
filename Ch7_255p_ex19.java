import java.util.Scanner;

//입력한 숫자만큼 별표 출력
public class Ch7_255p_ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int i, k;
		int star;
		
		System.out.printf("숫자를 여러 개 입력 : ");
		str = s.nextLine();
		
		i=0;
		ch = str.charAt(i);
		while (true) {
			star = (int)ch - 48;	//문자->숫자(ex. 문자5는 아스키값 53, 숫자5로 만들려면 48을 뺀다)
			
			for (k=0; k<star; k++)
				System.out.printf("*");
			System.out.printf("\n");
			
			if (++i > str.length()-1)	//먼저 i를 1 증가시키고, (문자열 길이-1)보다 크면 while문 종료
				break;
			ch = str.charAt(i);		//문자열에서 한 글자 추출
		}
	}

}
