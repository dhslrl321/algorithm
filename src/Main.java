import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> inputList = new ArrayList<>();

        while (true) {
            String input = br.readLine();
            if (!(input.equals("0"))) {
                inputList.add(input);
            } else {
                break;
            }
        }

        for (String item : inputList) {
            String temp = item.replaceAll(" ", "");
            char[] data = temp.substring(1).toCharArray();

            List<Character> datas = new ArrayList<>();

            for (int i = 0; i < data.length; i++) {
                datas.add(data[i]);
            }

            Collections.sort(datas);

            int cnt = 0;

            for (int i = 0; i < datas.size(); i++) {
                if (datas.get(i) == '0') {
                    cnt++;
                }
            }

            if (cnt != 0) {
                datas.subList(0, cnt).clear();

                for (int i = 0; i < cnt; i++) {
                    datas.add(2, '0');
                }
            }

            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();

            for (int i = 0; i < datas.size(); i++) {
                if (i % 2 == 1) {
                    left.append(datas.get(i));
                } else {
                    right.append(datas.get(i));
                }
            }
            int result = Integer.parseInt(left.toString()) + Integer.parseInt(right.toString());

            bw.write(result + "\n");
            bw.flush();
        }

        bw.close();
    }
}
