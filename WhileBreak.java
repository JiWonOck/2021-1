import java.util.Scanner;

public class WhileBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner rd = new Scanner(System.in);
		int input;	//Ű���� �Է¹ޱ�
		double sum = 0;	//������ ��հ��� ���� double�� ����
		int count =0;	//�Է� ����
		
		//while�� �ۼ��ϱ� --> ���ѷ�����
		while(true) {
			System.out.print("����� ���� ���� �Է��ϼ��� (�Է��� �����Ϸ��� 0�� �Է�): ");
			input = rd.nextInt();
			
			//if���� break�� ���
			if (input == 0)
				break;
			sum+= input;
			count ++;
			
		}
		System.out.printf("�Էµ� ���� ������ %d��, ����� %.1f�Դϴ�.", count, sum / count);
	}

}
