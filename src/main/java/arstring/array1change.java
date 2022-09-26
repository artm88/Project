package arstring;

import java.util.Arrays;

public class array1change {
    public static void main(String[] args) {
        int[] arrayOfNumber = {0, 1, 2, 3, 4, 5}; //поменять местами первый и последний элемен
        int temp1 = arrayOfNumber[0];
        int temp2 = arrayOfNumber[5];
        arrayOfNumber[0] = temp2;
        arrayOfNumber[5] = temp1;
        System.out.println(Arrays.toString(arrayOfNumber));
    }
}
