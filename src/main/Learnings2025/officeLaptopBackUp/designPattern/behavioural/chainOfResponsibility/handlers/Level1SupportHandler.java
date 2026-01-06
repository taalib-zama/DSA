package designPattern.behavioural.chainOfResponsibility.handlers;

import designPattern.behavioural.chainOfResponsibility.Priority;
import designPattern.behavioural.chainOfResponsibility.Request;
import designPattern.behavioural.chainOfResponsibility.SupportHandler;

public class Level1SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;

    }

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }

    }
}
