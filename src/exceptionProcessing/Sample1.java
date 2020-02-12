package exceptionProcessing;



public class Sample1 {

	public static void main(String[] args) {

		try {

			int[] test = new int[1];

			test[3] = 1;

			System.out.println(test[1]);

		}

		catch(Throwable e) {
			System.out.println("OutOfRange\nException occured\t" + e);
		}

		finally{
			System.out.println("end");
		}
	}

}
