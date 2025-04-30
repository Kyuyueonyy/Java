package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성 - LinkedList로 구현
        Queue<Message> msgQue = new LinkedList<>();

        //큐에 메세지 인스턴스 추가
        msgQue.offer(new Message("sendMail", "홍길동"));
        msgQue.offer(new Message("sendSMS", "신용권"));
        msgQue.offer(new Message("sendKakaotalk", "감자바"));

        //큐가 빌 때까지 큐에서 message 추출하며 출력
        while(!msgQue.isEmpty()) {
            Message message = msgQue.poll();

            switch(message.command) {
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;

                case "sendSMS" :
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;

                case "sendKakaotalk" :
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
