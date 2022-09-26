package arstring;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arrayOfNumber={0,1,2,3,4,5}; //поменять местами первый и последний элемен
        int temp1=arrayOfNumber[0];
        int temp2=arrayOfNumber[5];
        arrayOfNumber[0]=temp2;
        arrayOfNumber[5]=temp1;
        System.out.println(Arrays.toString(arrayOfNumber));
        double[] arrayOfFloat={1.5, 2.0, 3.5}; // вычислить сумму, произведение, среднее
        double sum=arrayOfFloat[0]+arrayOfFloat[1]+arrayOfFloat[2];
        double mult=arrayOfFloat[0]*arrayOfFloat[1]*arrayOfFloat[2];
        double aver=(arrayOfFloat[0]+arrayOfFloat[1]+arrayOfFloat[2])/arrayOfFloat.length;
        System.out.println(Double.toString(sum));
        System.out.println(Double.toString(mult));
        System.out.println(Double.toString(aver));
        char[] arrayOfChar1={'H', 'e', 'l', 'l', 'o'}; // перевернуть и вывести строкой
        String[] arrayOfString2=new String[5];
        arrayOfString2[0]=Character.toString(arrayOfChar1[4]);
        arrayOfString2[1]=Character.toString(arrayOfChar1[3]);
        arrayOfString2[2]=Character.toString(arrayOfChar1[2]);
        arrayOfString2[3]=Character.toString(arrayOfChar1[1]);
        arrayOfString2[4]=Character.toString(arrayOfChar1[0]);
        System.out.println(arrayOfString2[0]+arrayOfString2[1]+arrayOfString2[2]+arrayOfString2[3]+arrayOfString2[4]);
        int[] aON={1,2,3,4,5}; // вывести среднее
        System.out.println(Integer.toString((aON[0]+aON[1]+aON[2]+aON[3]+aON[4])/aON.length));
        String str1="Amazing"; // вывести первые и последние три буквы слова
        System.out.println(str1.substring(0,3));
        System.out.println(str1.substring(str1.length()-3,str1.length()));
        String str2="Prato"; // вывести букву в середине слова
        System.out.println(str2.substring(str2.length()/2,(str2.length()/2)+1));
        String str3="бот"; // понять, входит ло слово в другое слово
        String str4="Разработчик";
        System.out.println(Boolean.toString(str4.contains(str3)));
        String str5="Java"; // вывести на каком месте находится данный символ
        char symbol='v';
        System.out.println(Integer.toString(str5.indexOf(symbol)));
        byte[] arOfBy=new byte[5]; //вывести массивы по умолчанию
        short[] arOfSh=new short[5];
        int[] arOfIn=new int[5];
        long[] arOfLo=new long[5];
        float[] arOfFl=new float[5];
        double[] arOfDo=new double[5];
        char[] arOfCh=new char[5];
        boolean[] arOfBo=new boolean[5];
        String[] arOfSt=new String[5];
        System.out.println(Arrays.toString(arOfBy));
        System.out.println(Arrays.toString(arOfSh));
        System.out.println(Arrays.toString(arOfIn));
        System.out.println(Arrays.toString(arOfLo));
        System.out.println(Arrays.toString(arOfFl));
        System.out.println(Arrays.toString(arOfDo));
        System.out.println(Arrays.toString(arOfCh));
        System.out.println(Arrays.toString(arOfBo));
        System.out.println(Arrays.toString(arOfSt));
        byte By=10; //вывести примеры переменных
        short Sh=-300;
        int In=-100000;
        long Lo= 1000;
        float Fl=10.125f;
        double Do=10.111;
        char Ch='c';
        boolean Bo=true;
        String St="hi";
        System.out.println(Byte.toString(By));
        System.out.println(Short.toString(Sh));
        System.out.println(Integer.toString(In));
        System.out.println(Long.toString(Lo));
        System.out.println(Float.toString(Fl));
        System.out.println(Double.toString(Do));
        System.out.println(Character.toString(Ch));
        System.out.println(Boolean.toString(Bo));
        System.out.println(St);
        String str6="java"; // сделать заглавными первую и последнюю буквы
        String str7=str6.substring(0,1).toUpperCase()+str6.substring(1,str6.length()-1)+str6.substring(str6.length()-1,str6.length()).toUpperCase();
        System.out.println(str7);
    }
}
