import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample14 {

	public static void main(String[] args) throws IOException{

		System.out.println("テストの受験者数を入力してください");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num =Integer.parseInt(str);

		int[] test;
		test = new int[num];

		System.out.println(test.length + "人分の成績を記入してください");

		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "人目の成績");
			str = br.readLine();
			test[i] = Integer.parseInt(str);

		}


		for(int srt=0; srt<test.length-1; srt++) {
			for(int trt=srt+1; trt<test.length; trt++) {
				if(test [trt] > test[srt]) {
					int im = test[trt];
					test[trt] = test[srt];
					test[srt] = im;
				}
			}
		}

		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "番の人の点数は" + test[i] + "です");
		}
	}

}
