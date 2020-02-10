package cars;

public class Sample7 {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.show();

		int number = 1111;
		double gaso = 11.1;
		String str = "first";

		car1.setCar(number, gaso);
		car1.setName(str);

		car1.show();

	}

}
