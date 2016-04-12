package week1;

import java.util.Scanner;

/**
 * 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
 * ду. Какая из них больше?
 */
public class Additional_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first speed value in km/h: ");
        double speed1 = sc.nextDouble();
        System.out.println("Enter second speed value in m/s: ");
        double speed2 = sc.nextDouble();
//        Convert speed1 value to m/s
        speed1 = speed1 * 1000 / 3600;
        if (speed1 > speed2){
            System.out.printf("First speed is faster, it equals to %,.2f m/s", speed1);
        } else {
            System.out.println("Second speed is faster");
        }
    }
}
