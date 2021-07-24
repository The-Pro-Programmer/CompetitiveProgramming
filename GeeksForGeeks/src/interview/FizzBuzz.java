package interview;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(1, 100);
	}
	
	private static void fizzBuzz(int min, int max) {
		for(int i=min; i<=max; i++) {
			if(i%15==0) {
				System.out.println(i + " FizzBuzz");
			}else if(i%5==0) {
				System.out.println(i + " Buzz");
			}else if(i%3==0) {
				System.out.println(i + " Fizz");
			}
		}
	}

}
