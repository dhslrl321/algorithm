package solved.class2;

import java.io.*;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {

            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            int change = Integer.parseInt(br.readLine());

            if(change / 25 != 0) {
                quarter += change / 25;
                change -= 25 * (change / 25);
            }

            if(change / 10 != 0){
                dime += change / 10;
                change -= 10 * (change / 10);
            }

            if(change / 5 != 0) {
                nickel += change / 5;
                change -= 5 * (change / 5);
            }

            if(change / 1 != 0) {
                penny += change;
            }

            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }

        bw.flush();
        bw.close();
    }
}
