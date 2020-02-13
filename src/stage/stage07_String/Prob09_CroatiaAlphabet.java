package stage.stage07_String;

import java.util.Scanner;

public class Prob09_CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int count = 0;

       while(true){
            if(str.contains("c=")){
                str = str.replace("c=", "*");
            }else if(str.contains("c-")){
                str = str.replace("c-", "*");
            }else if(str.contains("dz=")){
                str = str.replace("dz=", "*");
            }else if(str.contains("d-")){
                str = str.replace("d-", "*");
            }else if(str.contains("lj")){
                str = str.replace("lj", "*");
            }else if(str.contains("nj")){
                str = str.replace("nj", "*");
            }else if(str.contains("s=")){
                str = str.replace("s=", "*");
            }else if(str.contains("z=")){
                str = str.replace("z=", "*");
            }else {
                break;
            }
        }
        System.out.println(str.length());
    }
}
