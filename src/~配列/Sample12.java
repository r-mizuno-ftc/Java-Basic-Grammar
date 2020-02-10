import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample12 {

	public static void main(String[] args) throws IOException{

		System.out.println("テストの受験者数を入力してください");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num =Integer.parseInt(str);

		int[] test;
		test = new int[num];

		System.out.println(num + "人分の成績を記入してください");

		for(int i=0; i<num; i++) {
			System.out.println((i+1) + "人目の成績");
			str = br.readLine();
			int pnt = Integer.parseInt(str);
			test[i] = pnt;
		}

		for(int i=0; i<num; i++) {
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です");
		}
	}

}
