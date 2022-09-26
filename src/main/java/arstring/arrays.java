package arstring;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
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
    }
}
