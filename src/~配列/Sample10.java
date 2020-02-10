public class Sample10{

	public static void main(String[] args) {

		int [] w;
		w = new int[5];

		w[0] = 65;
		w[1] = 22;
		w[2] = 45;
		w[3] = 77;
		w[4] = 99;

		for (int i = 0; i<5 ;i++) {
			System.out.println((i+1) + "番目の人の点数は" + w[i] + "です");
		}
	}
}