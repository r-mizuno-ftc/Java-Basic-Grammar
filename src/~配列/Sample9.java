import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample9 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ループを抜け出す構文です");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res =Integer.parseInt(str);

		for(int i=1; i<=30; i++) {
			System.out.println(i + "番目の処理です");
			if(i == res)
				break;
		}
	}

}
