package thread.t1;

public class ThreadByExtends extends Thread {
    @Override
    public void run() {
        System.out.println("---(상속을 이용한 Thread)" + getName() + "---");
    }
}
