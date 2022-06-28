package daytwo;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        a = sc.nextInt();
        System.out.print("Enter value b: ");
        b = sc.nextInt();

        System.out.printf("is %d equal to %d? - %b%n", a, b, (a==b));
        System.out.printf("is %d less than %d? - %b%n", a, b, (a<b));
        System.out.printf("is %d less or equal to %d? - %b%n", a, b, (a<=b));
        System.out.printf("is %d greater than %d? - %b%n", a, b, (a>b));
        System.out.printf("is %d greater or equal to %d? - %b%n", a, b, (a>=b));

    }
}
