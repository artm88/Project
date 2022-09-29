package Syntax;

public class Syntaxbool {
    public static void main (String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a & b);
        System.out.println(a &= false);
        a = true;
        b = false;
        System.out.println(a | b);
        System.out.println(a |= false);
        a = true;
        b = false;
        System.out.println(a ^ b);
        System.out.println(a ^= false);
        a = true;
        b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a ?1:2);
        System.out.println(!a);
    }
}
