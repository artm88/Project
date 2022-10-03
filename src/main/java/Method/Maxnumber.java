package Method;

public class Maxnumber {
    public static void main(String[] args) {
        System.out.println(findOfMaxNumber(3,4));
        System.out.println(findOfMaxNumber(5,3,4));
        System.out.println(findOfMaxNumber(5,3,6,4));
    }
    private static int findOfMaxNumber (int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    private static int findOfMaxNumber (int a, int b, int c) {
        if (a>b & a>c) {
            return a;
        }
        else if (b>a & b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    private static int findOfMaxNumber (int a, int b, int c, int d) {
        return findOfMaxNumber(findOfMaxNumber(a,b),findOfMaxNumber(c,d));
    }
}
