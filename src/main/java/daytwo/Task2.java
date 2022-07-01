package daytwo;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        boolean b1, b2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value b1: ");
        b1 = sc.nextBoolean();
        System.out.print("Enter value b2: ");
        b2 = sc.nextBoolean();

        System.out.printf("is b1 and b2 equal? - %b%n", (b1==b2));
    }
}
