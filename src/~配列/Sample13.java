public class Sample13{

	public static void main(String[] args) {
		int[] test = new int[5];

		test[0]=10 ;
		test[1]=12 ;
		test[2]=23 ;
		test[3]=64 ;
		test[4]=44 ;

		for (int i=0; i<5; i++) {
			System.out.println(i+1 + test[i]);
		}
	}
}