import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int x, y, sum;
		
		System.out.printf("첫 번째 숫자 입력: ");
		x=in.nextInt();
		
		System.out.printf("두 번째 숫자 입력: ");
		y=in.nextInt();
		
		sum= x+y;
		
		System.out.printf("두 수의 합은 %d입니다.", sum);
	

	}

}
