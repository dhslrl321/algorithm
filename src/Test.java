import java.util.*;

public class Test {
    public static void main(String[] args) {

        int input1 = 2;
        int input2 = 2;
        int input3 = 2;
        int input4 = 2;

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_-!@#$%^&*()+=\\|/{}0123456789";

        String flag = "where is medicine?";
        String flag1 = "";
        String flag2 = "";
        String flag3 = "";
        String flag4 = "";
        String flag5 = "";

        String cryptotext = str;

        flag1 = str.substring(15, 16);
        flag1 += cryptotext.substring(14, 15);
        flag1 += cryptotext.substring(23, 24);
        flag1 += cryptotext.substring(69, 70);


        flag2 = cryptotext.substring(38, 39);
        flag2 += cryptotext.substring(71, 72);
        flag2 += cryptotext.substring(27, 28);
        flag2 += cryptotext.substring(34, 35);
        flag2 += cryptotext.substring(72, 73);
        flag2 += cryptotext.substring(30, 31);
        flag2 += cryptotext.substring(52, 53);




        flag3 = cryptotext.substring(75, 76);
        flag3 += cryptotext.substring(39, 40);
        flag3 += cryptotext.substring(29, 30);
        flag3 += cryptotext.substring(52, 53);



        flag4 = cryptotext.substring(31, 32);
        flag4 += cryptotext.substring(43, 44);
        flag4 += cryptotext.substring(72, 73);
        flag4 += cryptotext.substring(29, 30);
        flag4 += cryptotext.substring(75, 76);
        flag4 += cryptotext.substring(52, 53);

        flag5 = cryptotext.substring(32, 33);
        flag5 += cryptotext.substring(71, 72);
        flag5 += cryptotext.substring(76, 77);
        flag5 += cryptotext.substring(46, 47);
        flag5 += cryptotext.substring(70, 71);

        flag = flag1 + flag2 + flag3 + flag4 + flag5;

        System.out.println();
        System.out.println(flag);



    }
}


