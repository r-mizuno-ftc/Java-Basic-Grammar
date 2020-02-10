package cars;

public class Sample14 {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();

		Car car3 = car1;

		boolean bl12 = car1.equals(car2);
		boolean bl13 = car1.equals(car3);

		System.out.println(bl12);
		System.out.println(bl13);

	}

}
