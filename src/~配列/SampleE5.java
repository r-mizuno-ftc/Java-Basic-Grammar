import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SampleE5 {


	public static void main(String[] args) throws IOException{

		System.out.println("5人のテストの点数を入力してください");

		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));


		int[] pt = new int[5];

		for(int i=0; i<pt.length; i++) {
			String str = br.readLine();
			pt[i] = Integer.parseInt(str);
		}

		for(int i=0; i<pt.length; i++) {
			System.out.println((i+1) + "番目の人の点数は" + pt[i] + "です");
		}

		int max = 0;

		for(int i=0; i<pt.length; i++) {
			if(max < pt[i]) {
				max = pt[i];




			}
		}

		System.out.println("最高点は" + max + "です");




	}
}
