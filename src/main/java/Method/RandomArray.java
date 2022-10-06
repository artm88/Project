package Method;

import java.util.Random; // подгрузка библиотеки генерации случайных чисел

public class RandomArray {
    public static void main(String[] args) {
        int length=5;
        printOfArray(getRandomArray(length));

    }
    public static int[] getRandomArray (int l) { //создает массив размерности l случайных чисел
        int[] randomNumbers = new int[l];
        Random rnd = new Random(); // вызов генератора случайных чисел
        for (int i=0; i<l; i+=1) {
            randomNumbers[i]=rnd.nextInt(100); // создание целочисленного случайного числа в диапазоне от 0 до 100
        }
        return randomNumbers;
    }
    public static void printOfArray(int[] newArray) {
        for (int i=0; i<newArray.length; i+=1) { // вывод массива случайных чисел
            System.out.print(newArray[i]+" ");
        }
    }
}
