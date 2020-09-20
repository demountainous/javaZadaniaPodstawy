package sda.basic.java.day1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        boolean result;

        result = firstDigit > secondDigit ? true : false;
        System.out.println("If x is greater than y: " + result);

        result = firstDigit * 3 > secondDigit ? true : false;
        System.out.println("If x * 3 is greater than y: " + result);

        result = (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit) ? true : false;
        System.out.println("If y++ is smaller than ++x & greater than y: " + result);

        result = (firstDigit * secondDigit) % 2 == 0 ? true : false;


       // int x = scanner.nextInt();
       // int y = scanner.nextInt();

 //       System.out.println(x < y);
 //       System.out.println(x * 3 > y);
 //       System.out.println(y++ < ++x) && (--x < y);
 //       System.out.println(x * y) % 2 == 0;

    }
}
