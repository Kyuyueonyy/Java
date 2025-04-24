package advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {

        // 동영상 재생 스레드 시작
        MovieThread movieThread = new MovieThread();
        movieThread.start();

        // 음악 재생 스레드 시작
        MusicRunnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable); // Runnable을 Thread로 감싸야 실행 가능
        musicThread.start();

        // 메인 스레드도 동시에 다른 작업 가능
        for (int i = 0; i < 3; i++) {
            System.out.println("메인 스레드 작업 중...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("메인 스레드 중단됨");
            }
        }
    }
}
