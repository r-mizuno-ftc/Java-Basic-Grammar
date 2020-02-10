package cars;
//車クラス

class Car
{
	public static int sum = 0;


	private int num;
	private double gas;


	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました");
	}

	public Car(int n, double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("ナンバー:" + n + "\nガソリン量:" + g +"\nとなります");
	}


	public static void showSum()
	{
		System.out.println("車は全部で" + sum + "台あります");
	}



	int getNum()
	{
		System.out.println("ナンバーを調べます");
		return num;
	}


	double getGas()
	{
		System.out.println("ガソリン量を調べます");
		return gas;
	}


	public void setCar(int n)
	{
		num = n;
		System.out.println("ナンバーを" + n + "に設定しました");

	}

	public void setCar(double g)
	{
		gas = g;
		System.out.println("ナンバーを" + g + "に設定しました");

	}


	public void setCar(int n, double g)
	{

			num = n;
			gas = g;

			System.out.println("ナンバーを" + num + "に、\nガソリン量を" + gas + "に設定しました");

	}

	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("車のガソリン量は" + gas + "です");
	}


}




