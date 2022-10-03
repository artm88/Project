package Method;

public class iterativOfFibonachhi {
    public static void main(String[] args) {
        System.out.println(findOfItFibonachi(8));
    }
    private static int findOfItFibonachi (int i) {
        int[] n =new int[i];
        int r=0;
        for (int j=0; j<i; j+=1 ) {
            if (j==0) {
                n[j]=0;
            }
            if (j==1) {
                n[j]=1;
            }
            if (j>1){
                n[j]=n[j-1]+n[j-2];
            }
            if (j==i-1){
                r=n[j];
            }
        }
        return r;
    }
}
