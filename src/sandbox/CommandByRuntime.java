package sandbox;

import java.io.IOException;
import java.util.concurrent.Executors;

public class CommandByRuntime {
    public static void main(String[] args) {

        String home = System.getProperty("user.home");

        Process process = null;

        try {
            process = Runtime.getRuntime()
                    .exec(String.format("sh -c ls %s", home));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(),
                (res) -> System.out.println(res));

        Executors.newSingleThreadExecutor().submit(streamGobbler);
    }
}