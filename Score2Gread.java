import java.util.Scanner;

public class Score2Gread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score, number;
		char grade;
		
		
		System.out.printf("������ �Է��Ͻÿ� : ");
		score = in.nextInt();
		number=score/10;
		
		switch (number) {
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
		}
	
		System.out.println("���� : " + grade);

	}

}
