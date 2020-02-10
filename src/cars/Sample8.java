package cars;

public class Sample8 {

	public static void main(String[] args) {

		Car[] cars = new Car[3];

		for(int i=0; i<cars.length; i++) {
			cars[i] = new Car();
			cars[i].setCar((int)(Math.random()*10000),(float)(Math.random()*100));
			cars[i].setName("car"+(i+1));
			cars[i].show();
		}

	}

}
