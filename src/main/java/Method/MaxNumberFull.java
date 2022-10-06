package Method;

import static Method.RandomArray.getRandomArray; // подгрузка метода создания массива случайных чисел
import static Method.RandomArray.printOfArray;

public class MaxNumberFull {
    public static void main(String[] args) {
        System.out.print(findOfMaxNumber(3,4));
        System.out.println();
        System.out.print(findOfMaxNumber(5,3,4));
        System.out.println();
        System.out.print(findOfMaxNumber(5,3,6,4));
        System.out.println();
        System.out.print(findOfMaxNumberFull(5,3,6,4));
        System.out.println();
        System.out.print(findOfMaxNumberFull(getRandomArray(5)));
    }
    private static int findOfMaxNumber (int a, int b) { // вычисление максимального из двух чисел
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    private static int findOfMaxNumber (int a, int b, int c) { // вычисление максимального из трех чисел
        return findOfMaxNumber(findOfMaxNumber(a,b),c);
    }
    private static int findOfMaxNumber (int a, int b, int c, int d) { // вычисление максимального из четырех чисел
        return findOfMaxNumber(findOfMaxNumber(a,b),findOfMaxNumber(c,d));
    }
    private  static int findOfMaxNumberFull (int... numbers) { // вычисление максимального из массива чисел
        printOfArray(numbers);
        System.out.println();
        int previousInt=numbers[0];
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMaxNumber(previousInt,numbers[i]); // использует метод вычисления максимального из двух чисел
            }
        return previousInt;
    }
}
