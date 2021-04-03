
public class timestable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, k;
		
		for(i=9; i>=1; i--) {
			for(k=9; k>=1; k--) {
				System.out.printf("%3dX%d=%2d", k, i, k*i);
			}
			System.out.printf("\n");
		}

	}

}
