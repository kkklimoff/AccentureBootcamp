package daythree;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] sourceArray = {3, 13, 37, 88};
        int[] destinationArray = new int[4];

        for (int i = 0; i < sourceArray.length; i++){
            destinationArray[i] = sourceArray[i];
        }

        System.out.println(Arrays.toString(destinationArray));
    }
}
