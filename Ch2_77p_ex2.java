import java.util.Scanner;
//if���� Ȱ���� ����
public class Ch2_77p_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, oper, result;
		
		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = in.nextInt();
		
		System.out.printf("<1>���� <2>���� <3>���� <4>������ ==> ");
		oper = in.nextInt();
		
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = in.nextInt();
		
		if (oper==1)	{
				result = a + b;
				System.out.printf("%d+%d=%d", a, b, result);
		}
		if (oper==2)	{
			result = a - b;
			System.out.printf("%d-%d=%d", a, b, result);
		}
		if (oper==3)	{
			result = a * b;
			System.out.printf("%d*%d=%d", a, b, result);
		}if (oper==4)	{
			result = a / b;
			System.out.printf("%d/%d=%d", a, b, result);
		}
		

	}

}
