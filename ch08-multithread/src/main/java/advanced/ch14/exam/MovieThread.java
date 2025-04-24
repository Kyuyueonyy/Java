package advanced.ch14.exam;

public class MovieThread extends Thread {

    @Override
    public void run() {
        // 3회 반복
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000); // 1초(1000ms) 일시 정지
            } catch (InterruptedException e) {
                System.out.println("스레드가 중단되었습니다.");
            }
        }
    }
}
