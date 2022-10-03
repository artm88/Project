package Method;

public class Average {
    public static void main(String[] args) {
    System.out.println(findOfAverage(4,1,3));
    }
    private static int findOfAverage (int a, int b, int c) {
        if (a>b & a<c) {
            return a;
        }
        else if (b>a & b<c) {
            return b;
        }
        else {
            return c;
        }
    }
}
