package advanced.ch14.exam;

public class MusicRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500); // 0.5초 = 500밀리초
            } catch (InterruptedException e) {
                System.out.println("음악 스레드가 중단되었습니다.");
            }
        }
    }
}
