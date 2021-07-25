package thread.t1;

public class ThreadByImpl implements Runnable {
    @Override
    public void run() {
        Thread thisThread = Thread.currentThread();
        System.out.println("---(구현 이용한 Thread)" + thisThread + "---");
    }
}
