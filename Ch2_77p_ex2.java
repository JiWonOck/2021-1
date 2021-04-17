import java.util.Scanner;
//if¹®À» È°¿ëÇÑ °è»ê±â
public class Ch2_77p_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, oper, result;
		
		System.out.printf("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==> ");
		a = in.nextInt();
		
		System.out.printf("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==> ");
		oper = in.nextInt();
		
		System.out.printf("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==> ");
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
