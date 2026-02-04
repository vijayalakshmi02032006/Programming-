public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + " is prime: " + isPrime);
    }
}
