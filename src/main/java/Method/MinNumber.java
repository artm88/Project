package Method;

import static Method.RandomArray.getRandomArray; // подгрузка метода создания массива случайных чисел
import static Method.RandomArray.printOfArray;

public class MinNumber {
    public static void main(String[] args) {
        System.out.print(findOfMinNumber(3,4));
        System.out.println();
        System.out.print(findOfMinNumber(5,3,4));
        System.out.println();
        System.out.print(findOfMinNumber(5,3,6,4));
        System.out.println();
        System.out.print(findOfMinNumberFull(5,3,6,4));
        System.out.println();
        System.out.print(findOfMinNumberFull(getRandomArray(5)));
    }
    private static int findOfMinNumber (int a, int b) { // вычисление минимального из двух чисел
        if (a>b) {
            return b;
        }
        else {
            return a;
        }
    }
    private static int findOfMinNumber (int a, int b, int c) { // вычисление минимального из трех чисел
        return findOfMinNumber(findOfMinNumber(a,b),c);
    }
    private static int findOfMinNumber (int a, int b, int c, int d) { // вычисление минимального из четырех чисел
        return findOfMinNumber(findOfMinNumber(a,b),findOfMinNumber(c,d));
    }
    public static int findOfMinNumberFull(int... numbers) { // вычисление минимального из массива чисел
        printOfArray(numbers);
        System.out.println();
        int previousInt=numbers[0];
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMinNumber(previousInt,numbers[i]); // использует вычисление минимального из двух чисел
        }
        return previousInt;
    }
}
