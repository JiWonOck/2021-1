import java.util.Scanner;

//�Է��� ���ڸ�ŭ ��ǥ ���
public class Ch7_255p_ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int i, k;
		int star;
		
		System.out.printf("���ڸ� ���� �� �Է� : ");
		str = s.nextLine();
		
		i=0;
		ch = str.charAt(i);
		while (true) {
			star = (int)ch - 48;	//����->����(ex. ����5�� �ƽ�Ű�� 53, ����5�� ������� 48�� ����)
			
			for (k=0; k<star; k++)
				System.out.printf("*");
			System.out.printf("\n");
			
			if (++i > str.length()-1)	//���� i�� 1 ������Ű��, (���ڿ� ����-1)���� ũ�� while�� ����
				break;
			ch = str.charAt(i);		//���ڿ����� �� ���� ����
		}
	}

}
