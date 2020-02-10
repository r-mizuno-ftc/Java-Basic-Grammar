import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SampleE4 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		System.out.println("素数かどうかを判定します");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int g =Integer.parseInt(str);

		for(int i=2; i<=g; i++) {
			if(i == g) {
				System.out.println(g + "は素数");
			}
					else if(g % i == 0) {
					System.out.println(g + "は素数ではない");
					break;
					}

		}

	}

}
