package arstring;

public class string1BeginEnd {
    public static void main(String[] args) {
        String str1="Amazing"; // вывести первые и последние три буквы слова
        System.out.println(str1.substring(0,3));
        System.out.println(str1.substring(str1.length()-3,str1.length()));
    }
}
