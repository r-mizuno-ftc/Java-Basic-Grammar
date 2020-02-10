package cars;

class RacingCar extends Car {

	private int cors;

	public RacingCar() {

		cors = 0;
		System.out.println("レーシングカーを作成しました");

	}

	public RacingCar(int n,double g,int c) {
		super(n,g);
		cors = c;
		System.out.println("コース番号" + cors + "のレーシングカーを作成しました");
	}

	public void setCors(int c) {

		cors = c;
		System.out.println("コース番号を" + cors +"に設定しました");
	}

	public void show() {
		System.out.println("レーシングカーのナンバーは" + num +"です");
		System.out.println("ガソリン量は" + gas +"です");
		System.out.println("コース番号は" + cors +"です");
		System.out.println("レーシングカーの名前は" + name +"です");
	}

}
