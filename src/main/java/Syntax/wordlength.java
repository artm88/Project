package Syntax;

public class wordlength {
    public static void main(String[] args) {
        String name="ария";
        int len=name.length();
        if (len<5) {
            if (name.substring(0,1).equals("а")==true) {
                System.out.println("первая буква - а");
            }
                else {
                System.out.println(name.substring(1,len));
            }
        }

            else if (len>5) {
                if (name.substring(len-1,len).equals("я")==true) {
                    System.out.println("Последняя буква - я");
                }
                else {
                    System.out.println(name.substring(0,len-1));
                }

            }
            else {
                System.out.println(name);
            }
    }
}
