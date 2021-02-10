import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            String[] numbers = br.readLine().split(" ");

            for(int i = 1; i <= n; i++) {
                graph.get(i).add(Integer.parseInt(numbers[i-1]));
            }

            visited = new boolean[n + 1];
            for(int i = 1; i <= n; i++){
                dfs(i);
            }

            bw.write(Arrays.toString(visited));

        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int start) {
        if(visited[start]) return ;
        visited[start] = true;
        for(int value : graph.get(start)) {
            if(!visited[start]) dfs(value);
        }
    }
}

