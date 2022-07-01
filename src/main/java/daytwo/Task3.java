package daytwo;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        x = sc.nextInt();

        System.out.println(x % 2 == 0);
    }
}
