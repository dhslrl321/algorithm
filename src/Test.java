
public class Test {
    public static void main(String[] args) {
        String a = "a ";
        String b = " b ";
        String c = " c";

        String abc = a+b+c;
        System.out.println(abc);
        String d = "asdf";
        abc += d;
        System.out.println(abc);
    }

}