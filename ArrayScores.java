import java.util.Scanner;

public class ArrayScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5; //�л��� -->������� (�л����� �ٲ�� ���⼭�� �����ϸ� ��)
		int total = 0;	//total�� ���� �հ�
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS]; //5��� STUDENTS��
		
		//5���� �л����� �Է¹ޱ�
		for (int i=0; i<scores.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		
		//�迭 �����ؼ� ���� ������ ����
		for (int i=0; i<scores.length; i++)
			total += scores[i];
		
		System.out.println("��� ������ " + total / STUDENTS + "�Դϴ�");

	}

}
