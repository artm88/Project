package Method;

import static Method.RandomArray.getRandomArray;
import static Method.RandomArray.printOfArray;

public class Sorting {
    public static void main(String[] args) {
        printOfArray(sortOfArray(getRandomArray(5)));
    }
    private static int[] sortOfArray (int[] array) {
        //printOfArray(array);
        //System.out.println();
        int lengthOfArray=array.length;
        int[] finalArray=new int[lengthOfArray];
        for (int j=0; j< searchOfElement(0,array); j+=1) {
            finalArray[j]=0;
        }
        int temp = findOfMinNumberFull(array);
        for (int j=0; j< searchOfElement(temp,array); j+=1) {
            finalArray[j]=temp;
        }
        for (int i=0; i<lengthOfArray;i+=1){

            int temp = findOfMinNumberFull(array);
            for (int j=0; j< searchOfElement(temp,array); j+=1) {
                finalArray[j]=temp;
            }


        }
        return finalArray;
    }
    private static int searchOfElement (int element, int[] array) {
        int count=1;
        for (int i=0; i<array.length; i+=1) {
            if (array[i]==element) {
                count+=1;
            }
        }
        return count;
    }
    private static int findOfMinNumberAdd (int a, int b) { // вычисление минимального из двух чисел
        if (a!=0&b!=0) {
            if (a > b) {
                return b;
            } else {
                return a;
            }
        }
    }
    public static int findOfMinNumberFullAdd(int... numbers) { // вычисление минимального из массива чисел
        //printOfArray(numbers);
        //System.out.println();
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMinNumberAdd(previousInt,numbers[i]); // использует вычисление минимального из двух чисел
        }
        int previousInt=numbers[0];
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMinNumberAdd(previousInt,numbers[i]); // использует вычисление минимального из двух чисел
        }
        return previousInt;
    }
    private static int[] delOfElement (int element, int[] array){
        int[] newArray=new int[array.length];
        int count=0;
        int j=0;
        for (int i=0; i<array.length; i+=1) {
            if (array[i]!=element | count==1){
                newArray[j]=array[i];
                j+=1;
            }
            else  {
                count=1;
            }
        }
        return newArray;
    }

}
