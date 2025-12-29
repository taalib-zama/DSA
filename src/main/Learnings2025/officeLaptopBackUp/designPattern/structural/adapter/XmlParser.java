package designPattern.structural.adapter;

// Adaptee class
public class XmlParser {
    public String parseXml(String xmlData) {
        return "Parsed XML: " + xmlData;
    }
}
