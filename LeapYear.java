import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� �Է¹ޱ�
		Scanner in=new Scanner(System.in);
		int year;
		boolean isLeapYear;
		
		System.out.printf("������ �Է��ϼ��� : ");
		year = in.nextInt();
		
		isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		//���׿����� ����ؼ� ����ϱ�
		System.out.printf(isLeapYear ? "����" : "������ �ƴ�");
	
		
	}

}
