package thread.t2;

/**
 * 싱글 쓰레드 vs 멀티 쓰레드
 * console 이라는 동일한 자원을 서로 점유하기 위해 경쟁을 시도
 * */

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadByImpl());

        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);

        for (int i = 0; i < 100; i++) {
            System.out.print("1 ");
        }
    }
}
