package thread.t2;

public class ThreadByImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("2");
        }
    }
}
