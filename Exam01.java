import java.util.Scanner;

//�Էµ� ���ڿ� �Ųٷ� ����ϱ�
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ss;						//���ڿ� ss, tt����, tt�� ""�� �ʱ�ȭ
		String tt = "";
		int count, i;
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		ss = s.nextLine();				//���ڿ� �Է�
		
		count = ss.length();			//�Է¹��� ������ ����(���ڿ��� ����)�� ����
		
		for (i=0; i<count; i++) {		//���ڿ��� ������ŭ �ݺ��ؼ� tt�� �Է¹��� ���ڿ��� �Ųٷ� ����
			tt += ss.charAt(count-(i+1));
		}
		
		System.out.printf("������ �Ųٷ� ��� ==> %s", tt);

	}

}
