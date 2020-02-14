
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String b = "push 3";
        String[] arr = b.split(" ");
        int roop = 2;
        while(roop > 0){
            System.out.println(arr[0]);
            --roop;
        }
    }
}
