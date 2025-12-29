package designPattern.behavioural.chainOfResponsibility;

import designPattern.behavioural.chainOfResponsibility.handlers.Level1SupportHandler;
import designPattern.behavioural.chainOfResponsibility.handlers.Level2SupportHandler;
import designPattern.behavioural.chainOfResponsibility.handlers.Level3SupportHandler;

public class Client {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Request req1 = new Request(Priority.BASIC);
        Request req2 = new Request(Priority.INTERMEDIATE);
        Request req3 = new Request(Priority.CRITICAL);
        Request req4 = new Request(Priority.BASIC);

        level1.handleRequest(req1);
        level1.handleRequest(req2);
        level1.handleRequest(req3);
        level2.handleRequest(req4);
    }
}
