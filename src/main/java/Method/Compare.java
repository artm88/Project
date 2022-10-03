package Method;

public class Compare {
    public static void main(String[] args){
        System.out.println(compareOfString("дратут", 'д', 'р','а','т','у','т','и'));
    }
    private static boolean compareOfString (String s, char ... c ) {
        String stringOfChar = new String(c);
        return s.equalsIgnoreCase(stringOfChar);
    }

}
