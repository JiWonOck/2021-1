import java.util.Scanner;

//�Է��� ���ڿ��� ���� ����
public class Ch07_254p_ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt = 0, lower_cnt=0, digit_cnt=0;	//�빮��, �ҹ���, ���� ���� �ʱ�ȭ
		int i;
		
		System.out.printf("���ڿ��� �Է� : ");
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
		
		System.out.printf("�빮�� %d��, �ҹ��� %d��, ����%d��\n", upper_cnt, lower_cnt, digit_cnt);
	}

}
