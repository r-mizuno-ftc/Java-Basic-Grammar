package exceptionProcessing;

public class ExceptProc extends Exception{

}
class Car{

	protected int num;
	protected double gas;

	public void setCar(int n, double g) throws ExceptProc{

		if(g < 0) {
			ExceptProc e = new ExceptProc();
			throw e;
		}else {
			num = n;
			gas = g;

			System.out.println("ナンバーを" + num + "に、ガソリン量を" + gas + "に設定しました");

		}

	}
}
