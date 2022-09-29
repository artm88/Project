package Syntax;

public class stars {
    public static void main(String[] args)  {
        int num=5; // вывод треугольника из звездочек по нарастанию
        for (int i=0;i<=num;i+=1){
            for (int j=0; j<i; j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<=num;i+=1){   // вывод треугольника из звездочек по убыванию
            for (int j=0; j<num-i; j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
