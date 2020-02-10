package cars;

//Carクラスのオブジェクトを作成する
class Sample1{
	public static void main(String[] args) {
		Car car1 = new Car();

		car1.setCar(9000, -88.99);
		car1.show();

		car1.setCar(1234);
		car1.show();

		car1.setCar(100.0);
		car1.show();



	}
}
