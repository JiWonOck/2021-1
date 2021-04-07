import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM = 5;
		Scanner scan = new Scanner(System.in);
		
		int[] input = new int[NUM];
		
		for(int i=0; i<input.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			input[i] = scan.nextInt();
		}
		
		int max;
		max = input[0];
		
		for(int i=1; i<input.length; i++) {
			if( input[i] > max)
				max = input[i];
		}
		
		System.out.printf("입력된 수에서 가장 큰 수는 %d입니다.", max);

	}

}
