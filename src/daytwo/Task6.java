package daytwo;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int a, b;
        boolean res = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        a = sc.nextInt();
        System.out.print("Enter value b: ");
        b = sc.nextInt();

        if((a==b) ||
                (a < 0 && b > 0) ||
                (a > 100 && b > 100))
            res = true;
        System.out.printf("a is %d and b is %d -> %b", a, b ,res);
    }
}
