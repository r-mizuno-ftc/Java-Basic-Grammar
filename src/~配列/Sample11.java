import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample11 {

	public static void main(String[] args) throws IOException{

		System.out.println("ループ中の特定箇所を飛ばす構文です");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res =Integer.parseInt(str);

		for(int i=1; i<=30; i++) {
			if(i == res)
				continue;
			System.out.println(i + "番目の処理です");


		}
	}

}
