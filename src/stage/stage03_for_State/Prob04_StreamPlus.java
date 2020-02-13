package stage.stage03_for_State;


import java.io.*;

public class Prob04_StreamPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(input.readLine().trim());

        for (int i = 0; i < loop; i++) {
            String text = input.readLine();
            String[] br = text.split("");

            int a = Integer.parseInt(br[0]);
            int b = Integer.parseInt(br[1]);
            output.write((a + b) + "\n");
        }
        output.flush();
        output.close();
    }
}

