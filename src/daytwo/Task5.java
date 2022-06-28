package daytwo;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        boolean inp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter boolean value: ");
        inp = sc.nextBoolean();
        System.out.printf("Opposite of \"%b\" is \"%b\"", inp, !inp);

    }
}
