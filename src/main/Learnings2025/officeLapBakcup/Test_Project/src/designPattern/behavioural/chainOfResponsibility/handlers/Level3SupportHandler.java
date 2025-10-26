package designPattern.behavioural.chainOfResponsibility.handlers;

import designPattern.behavioural.chainOfResponsibility.SupportHandler;

public class Level3SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;

    }

    @Override
    public void handleRequest(designPattern.behavioural.chainOfResponsibility.Request request) {
        if (request.getPriority() == designPattern.behavioural.chainOfResponsibility.Priority.CRITICAL) {
            System.out.println("Level 3 handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }

    }
}
