package Exception;

public class ThrowException {
	
	void checkAge(int age) {
		if(age<18)
			throw new ArithmeticException("Not eligible for voting.");
		else
			System.out.println("Elegible for voting.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException ob = new ThrowException();
		ob.checkAge(13);
		System.out.println("End of programe");
	}

}
