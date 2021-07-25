package thread.t1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new ThreadByExtends();

        Runnable runnable = new ThreadByImpl();
        Thread thread2 = new Thread(runnable);

        Thread thread3 = new Thread(new ThreadByImpl());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
