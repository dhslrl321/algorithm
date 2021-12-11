package sandbox;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AsyncThreadTest {
    public static void main(String[] args) {

        List<Coffee> coffees = Cafe.asyncOrder(List.of("americano", "latte", "milk", "water", "coke"));

        for (Coffee coffee : coffees) {
            System.out.println(coffee.toString());
        }
    }
}

class Cafe {
    static List<Coffee> asyncOrder(List<String> coffeeNames) {
        final List<CompletableFuture<Coffee>> futures = coffeeNames.stream()
                .map(coffeeName ->
                        CompletableFuture.supplyAsync(()
                        -> Coffee.of(coffeeName))
                .exceptionally(e -> Coffee.of("failed"))
                )
                .collect(Collectors.toList());

        return futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toUnmodifiableList());
    }
}

class Coffee {
    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    static Coffee of(String coffeeName) {
        delay();
        return new Coffee(coffeeName);
    }

    private static void delay() {
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}