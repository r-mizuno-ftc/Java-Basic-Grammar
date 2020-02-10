package point;

public class Mypoint {

	//座標
	private int x;
	private int y;

	//座標の設定
	public void setX(int px){
		if(px <=100 && px >=0) {
		x = px;
		}

	}

	public void setY(int py){
		if(py <=100 && py >=0) {

		y = py;
		}
	}

	//座標の取得
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	//コンストラクタ
	public Mypoint() {
		x = 0;
		y = 0;

	}

	public Mypoint(int px,int py) {
			x = px;



			y = py;

	}

}
