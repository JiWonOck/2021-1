import java.util.Scanner;

public class ArrayScores_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��� �� �л����� �Է��ϼ��� : ");
		int student = scan.nextInt();
		
		double total = 0;	//total�� ���� �հ�
		double[] scores = new double[student]; //5��� STUDENTS��
		
		//5���� �л����� �Է¹ޱ�
		for (int i=0; i<scores.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = scan.nextDouble();
		}
		
		//�迭 �����ؼ� ���� ������ ����
		for (int i=0; i<scores.length; i++)
			total += scores[i];
		
		System.out.printf("�� %d���� ��� ������ %.1f �Դϴ�.", student, total / student);


	}

}
