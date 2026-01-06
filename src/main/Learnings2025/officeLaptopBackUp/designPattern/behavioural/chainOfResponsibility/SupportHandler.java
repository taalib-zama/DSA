package designPattern.behavioural.chainOfResponsibility;

public interface SupportHandler {
    void setNextHandler(SupportHandler nextHandler);
    void handleRequest(Request request);
}
