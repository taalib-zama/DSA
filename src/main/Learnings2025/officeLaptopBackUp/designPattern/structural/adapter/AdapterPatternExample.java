package designPattern.structural.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        XmlParser xmlParser = new XmlParser();
        JsonParser adapter = new XmlToJsonAdapter(xmlParser);

        String result = adapter.parseJson("{ 'key': 'value' }");
        System.out.println(result);
    }
}
