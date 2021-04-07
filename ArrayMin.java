//배열에서 최솟값 찾기
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {10, 3, 19, 6, 18, 4, 1, 20};
		int min;
		
		min = s[0];
		
		for(int i=1; i<s.length; i++) {
			if( s[i]<min)
				min = s[i];
		}
		
		System.out.printf("최소값은 %d", min);
		//System.out.print("최소값은 " + min); 과 같음

	}

}