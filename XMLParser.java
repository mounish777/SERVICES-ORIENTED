import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
// import java.util.*;

public class XMLParser {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("customer_data.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            NodeList userNodes = document.getElementsByTagName("user");

            System.out.println(
                    "<html><body><table border='1'><tr><th>Name</th><th>Age</th><th>Gender</th><th>Mail</th></tr>");

            for (int i = 0; i < userNodes.getLength(); i++) {
                Node userNode = userNodes.item(i);

                if (userNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element userElement = (Element) userNode;
                    String name = userElement.getElementsByTagName("name").item(0).getTextContent();
                    String age = userElement.getElementsByTagName("age").item(0).getTextContent();
                    String gender = userElement.getElementsByTagName("gender").item(0).getTextContent();
                    String mail = userElement.getElementsByTagName("mail").item(0).getTextContent();

                    System.out.println("<tr><td>" + name + "</td><td>" + age + "</td><td>" + gender + "</td></tr>"
                            + mail + "</td></tr>");
                }
            }

            System.out.println("</table></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
