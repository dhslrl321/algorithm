import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String[] split = LocalDate.now()
                .format(DateTimeFormatter.ISO_DATE)
                .split("-");

        for(String value : split)
            System.out.println(value);
    }
}