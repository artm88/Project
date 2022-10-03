package Method;

public class recursionOfFibonachhi {
    public static void main(String[] args) {
        System.out.println(findOfFibonachi(8));
    }
    private static int findOfFibonachi (int i) {
        if (i==1) {
            return 0;
        }
        if (i==2) {
            return 1;
        }
        return findOfFibonachi(i-1)+findOfFibonachi(i-2);
    }
}
