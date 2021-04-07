import java.util.Scanner;

public class ArrayScores_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력할 총 학생수를 입력하세요 : ");
		int student = scan.nextInt();
		
		double total = 0;	//total은 성적 합계
		double[] scores = new double[student]; //5대신 STUDENTS로
		
		//5명의 학생성적 입력받기
		for (int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			scores[i] = scan.nextDouble();
		}
		
		//배열 접근해서 값을 가져와 연산
		for (int i=0; i<scores.length; i++)
			total += scores[i];
		
		System.out.printf("총 %d명의 평균 성적은 %.1f 입니다.", student, total / student);


	}

}
