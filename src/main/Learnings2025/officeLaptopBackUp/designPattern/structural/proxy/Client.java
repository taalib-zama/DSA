package designPattern.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.jpg");
        img.display();  // Loads and displays
        img.display();  // Displays without loading again
    }
}
