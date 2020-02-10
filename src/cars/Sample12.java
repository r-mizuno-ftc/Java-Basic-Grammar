package cars;

public class Sample12 {

	public static void main(String[] args) {

		Car[] cars  = new Car[3];

		cars[0] = new Car();
		cars[0].setCar(1111, 12);

		cars[1] = new RacingCar();
		cars[1].setCar(1112, 13);

		cars[2] = new Car();
		cars[2].setCar(1131, 121);

		for(int i=0; i<cars.length; i++) {
			cars[i].show();
		}
	}


}
