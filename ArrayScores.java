import java.util.Scanner;

public class ArrayScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5; //학생수 -->상수변수 (학생수가 바뀌면 여기서만 변경하면 됨)
		int total = 0;	//total은 성적 합계
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS]; //5대신 STUDENTS로
		
		//5명의 학생성적 입력받기
		for (int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i] = scan.nextInt();
		}
		
		//배열 접근해서 값을 가져와 연산
		for (int i=0; i<scores.length; i++)
			total += scores[i];
		
		System.out.println("평균 성적은 " + total / STUDENTS + "입니다");

	}

}
