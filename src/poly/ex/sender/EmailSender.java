package poly.ex.sender;

import org.w3c.dom.ls.LSOutput;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다: " + message);
    }
}
