package arstring;

public class array2Math {
    public static void main(String[] args) {
        double[] arrayOfFloat={1.5, 2.0, 3.5}; // вычислить сумму, произведение, среднее
        double sum=arrayOfFloat[0]+arrayOfFloat[1]+arrayOfFloat[2];
        double mult=arrayOfFloat[0]*arrayOfFloat[1]*arrayOfFloat[2];
        double aver=(arrayOfFloat[0]+arrayOfFloat[1]+arrayOfFloat[2])/arrayOfFloat.length;
        System.out.println(Double.toString(sum));
        System.out.println(Double.toString(mult));
        System.out.println(Double.toString(aver));
    }
}
