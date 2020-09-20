package sda.basic.java.day1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    private final static float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();

        float circumeference = calculateCirmeference(diameter);
        System.out.println("Circumeference Of A Circle: " + circumeference);

        float area = calculateOfArea(diameter);
    }
        private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        try {
        return scanner.nextFloat();
        } catch(InputMismatchException ex) {
            System.out.println("Wrong input");
            System.exit(1);
        } finally {
            System.out.println("finally step");
        }
        return 0;
        }

    private static float calculateCirmeference(float diameter){
        // pi * d
        return PI * diameter;
       }

    private static float calculateOfArea(float diameter) {
        float radius = diameter / 2;
        return PI * (float)Math.pow(radius, 2);
    }

}
