package cars;
//車クラス

class Car
{
	public static int sum = 0;


	protected int num;
	protected double gas;
	protected String name;



	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "noName";


		sum++;
		System.out.println("車を作成しました");
	}

	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバー:" + n + "ガソリン量:" + g +"の車を作成しました");
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


	public void setCar(int n, double g)
	{

			num = n;
			gas = g;

			System.out.println("ナンバーを" + num + "に、ガソリン量を" + gas + "に設定しました");

	}

	public String toString() {

		String str = "ナンバー:" + num +"\tガソリン量:" + gas;
		return str;
	}

	public void setName(String nm) {
		name = nm;
		System.out.println("名前を" + name +"に設定しました");

	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("車のガソリン量は" + gas + "です");
		System.out.println("車の名前は" + name + "です");
	}


}




