package arstring;

public class stringUpCase {
    public static void main(String[] args) {
        String str6="java"; // сделать заглавными первую и последнюю буквы
        String str7=str6.substring(0,1).toUpperCase()+str6.substring(1,str6.length()-1)+str6.substring(str6.length()-1,str6.length()).toUpperCase();
        System.out.println(str7);
    }
}
