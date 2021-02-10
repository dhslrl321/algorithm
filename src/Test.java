import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            int loop = 50000;
            while(loop-- > 0) {
                StringBuilder sb = new StringBuilder("http://ctf.j0n9hyun.xyz:2025/?page=");
                sb.append(Math.abs(loop - 50000));
                URL obj = new URL(sb.toString());
                HttpURLConnection con = (HttpURLConnection)obj.openConnection();
                con.setRequestMethod("GET");
                in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                String[] line = in.toString().split(" ");
                System.out.println(line[0]);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null)
                try {
                in.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
        }
    }
}

