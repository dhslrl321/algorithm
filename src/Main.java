public class Main {
    public static void main(String[] args) {
        char a = 'a';
        char z = 'z';
        int n = 3;

        int movedPoint = (((int)'z' + 3) - 97) % 26;
        System.out.println(movedPoint);
        System.out.println((char) (movedPoint + 97));
    }
}
