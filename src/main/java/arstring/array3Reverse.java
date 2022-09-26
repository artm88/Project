package arstring;

public class array3Reverse {
    public static void main(String[] args) {
        char[] arrayOfChar1={'H', 'e', 'l', 'l', 'o'}; // перевернуть и вывести строкой
        String[] arrayOfString2=new String[5];
        arrayOfString2[0]=Character.toString(arrayOfChar1[4]);
        arrayOfString2[1]=Character.toString(arrayOfChar1[3]);
        arrayOfString2[2]=Character.toString(arrayOfChar1[2]);
        arrayOfString2[3]=Character.toString(arrayOfChar1[1]);
        arrayOfString2[4]=Character.toString(arrayOfChar1[0]);
        System.out.println(arrayOfString2[0]+arrayOfString2[1]+arrayOfString2[2]+arrayOfString2[3]+arrayOfString2[4]);
    }
}
