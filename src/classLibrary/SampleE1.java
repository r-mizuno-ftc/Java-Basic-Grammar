package classLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleE1 {

	public static void main(String[] args)throws IOException{

		System.out.println("文字列を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println("aの挿入位置を整数で入力してください");

		String srit = br.readLine();

		int num = Integer.parseInt(srit);

		StringBuffer strp = new StringBuffer(str);
		strp.insert(num, "a");

		System.out.println(strp);

	}
}
