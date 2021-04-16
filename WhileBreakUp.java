import java.util.Scanner;

public class WhileBreakUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner rd = new Scanner(System.in);
		int input;	//키보드 입력받기
		double sum = 0;	//수들의 평균값을 위해 double로 선언
		int count =0;	//입력 개수
		
		System.out.print("평균을 구할 수를 입력하세요 (입력을 종료하려면 0을 입력): ");
		
		//단일 while문 작성하기
		while((input = rd.nextInt()) != 0 ) {
			sum+= input;
			count ++;
			
			System.out.print("평균을 구할 수를 입력하세요 (입력을 종료하려면 0을 입력): ");

		}
		System.out.printf("입력된 수의 개수는 %d개, 평균은 %.1f입니다.", count-1, sum/(count-1) );
	}

}
