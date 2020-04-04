package solved_Tier.bronze4;

import java.io.*;

public class Prob07_SpecialDay {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(input.readLine());
        int day = Integer.parseInt(input.readLine());

        if(month == 2){
            if(day == 18) output.write("Special" + "\n");
            else if(day < 18) output.write("Before" + "\n");
            else output.write("After" + "\n");
        }else if(month > 2) output.write("After" + "\n");
        else output.write("Before" + "\n");


        output.flush();
        output.close();
    }
}
