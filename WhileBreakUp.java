import java.util.Scanner;

public class WhileBreakUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner rd = new Scanner(System.in);
		int input;	//Ű���� �Է¹ޱ�
		double sum = 0;	//������ ��հ��� ���� double�� ����
		int count =0;	//�Է� ����
		
		//���� while�� �ۼ��ϱ�
		input = 1;
		
		while(input != 0) {
			System.out.print("����� ���� ���� �Է��ϼ��� (�Է��� �����Ϸ��� 0�� �Է�): ");
			input = rd.nextInt();
		
			sum+= input;
			count ++;
		}
		System.out.printf("�Էµ� ���� ������ %d��, ����� %.1f�Դϴ�.", count-1, sum/(count-1) );
	}

}
