package stage.stage06_Function;

public class Prob02_SelfNumber {
    public static void main(String[] args) {
        int[] num = new int[10000];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        int a = 12345;

        while(a != 0){
            System.out.println(a%10);
            a /= 10;
        }

    }
}

class SelfNumber {
    public int reader(int num){
        return num;
    }
}
