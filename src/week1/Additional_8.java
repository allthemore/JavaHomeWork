package week1;

import java.util.Scanner;

/**
 * 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 * тавляется, если сумма покупки превышает 1000 гривен.
 */
public class Additional_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        double price = sc.nextDouble();
        if (price > 1000.00){
            price = price - price * 0.10;
            System.out.printf("Your total price is 10 percent lower and equals to: %,.2f", price);
        } else {
            System.out.println("Total price is " + price);
        }
    }
}
