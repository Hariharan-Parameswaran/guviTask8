package guviTask8;

public class Q6Answer {

	public static void main(String[] args) {
       int number = 25;
        
        boolean isPrime = true;
        
        if (number == 0 || number == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

	}

}
