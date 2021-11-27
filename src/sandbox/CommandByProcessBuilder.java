package sandbox;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class CommandByProcessBuilder {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder();

        List<String> commands = new ArrayList<>();

        // commands.add("cd")

        builder.command("Desktop");
        builder.command("ls");

        builder.directory(new File(System.getProperty("user.home")));
        Process process = builder.start();

        StreamGobbler streamGobbler =
                new StreamGobbler(process.getInputStream(), System.out::println);

        Executors.newSingleThreadExecutor().submit(streamGobbler);
    }
}
