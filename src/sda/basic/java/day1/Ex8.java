package sda.basic.java.day1;

public class Ex8 {

    public static void main(String[] args) {
        boolean result = isPrimeNumber(5);
        System.out.println("If digit is prime: " + result);

        for(int i = 5; i < 100; i++) {

        }

    }
        private static boolean isPrimeNumber(int number) {
            if(number < 2) {
                return false;
            }
            for (int i = 2; i <= number / 2; i++) {
                if(number % i == 0) {
                    return false;
                }
            }
            return false;
    }
}
