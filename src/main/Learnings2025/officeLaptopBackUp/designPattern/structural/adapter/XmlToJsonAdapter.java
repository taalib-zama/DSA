package designPattern.structural.adapter;

public class XmlToJsonAdapter implements JsonParser {
    private XmlParser xmlParser;

    public XmlToJsonAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public String parseJson(String jsonData) {
        // Convert JSON to XML format (simplified for this example)
        String xmlData = "<data>" + jsonData + "</data>";
        return xmlParser.parseXml(xmlData);
    }
}
