package week1;

import java.util.Scanner;

/**
 * 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */
public class Additional_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input speed, km/h: ");
        int speed = sc.nextInt();
        System.out.println("Input distance, km");
        int distance = sc.nextInt();
        double time = speed / (double)distance;
//        calculate time in hours
        int hours = (int)time;
//        convert decimal value of time value to minutes
        double minutes = (time - hours) * 60;
//        convert decimal value of minutes value to seconds
        double seconds = (minutes - (int)minutes) * 60;
        System.out.printf("Travelling time: %1$d hours, %2$.0f minutes and %3$.0f seconds", hours, minutes, seconds);
    }
}
