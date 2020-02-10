package classLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2 {

	public static void main(String[] args) throws IOException{

		System.out.println("英字を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String stu = str.toUpperCase();
		String stl = str.toLowerCase();

		System.out.println(stu);
		System.out.println(stl);
	}
}
