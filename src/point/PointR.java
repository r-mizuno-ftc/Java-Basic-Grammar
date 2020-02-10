package point;

public class PointR {
	int x;
	int y;


	void setX(int px)
	{

	x = px;
	System.out.println("X座標を設定しました");

	}


	void setY(int py)
	{

	y = py;
	System.out.println("Y座標を設定しました");

	}


	int getX()
	{
		System.out.println("X座標を調べました");

		return x;
	}


	int getY()
	{
		System.out.println("Y座標を調べました");

		return y;
	}



}



class SampleE5
{
	public static void main(String[] args)
	{
		PointR point1 = new PointR();

		point1.setX(9089098);
		point1.setY(9929234);

		int xx = point1.getX();
		int yy = point1.getY();



		System.out.println("X座標は" + xx + "、Y座標は" + yy + "です");
	}
}
