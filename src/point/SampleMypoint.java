package point;

public class SampleMypoint {

	public static void main(String[] args) {
	// 座標の作成

		Mypoint p1 = new Mypoint();
		p1.setX(78);
		p1.setY(99);

	//座標の取得

		int px1 = p1.getX();
		int py1 = p1.getY();

	//座標の表示

		System.out.println("X座標は" + px1 + "\nY座標は" + py1 + "でした");

	// 座標の作成

		Mypoint p2 = new Mypoint();
		p2.setX(1000);
		p2.setY(99);

	//座標の取得

		int px2 = p2.getX();
		int py2 = p2.getY();

	//座標の表示
		System.out.println("X座標は" + px2 + "\nY座標は" + py2 + "でした");

	// 座標の作成

		Mypoint p3 = new Mypoint();
		p3.setX(9999);
		p3.setY(9999);

	//座標の取得

		int px3 = p3.getX();
		int py3 = p3.getY();

	//座標の表示
		System.out.println("X座標は" + px3 + "\nY座標は" + py3 + "でした");

	}

}
