package utility;

import company.Employee;
import company.Manager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlHandleManager {
    private static XmlHandleManager instance;
    private static DocumentBuilderFactory dbf;

    private XmlHandleManager() {
        dbf = DocumentBuilderFactory.newInstance();
    }
    public static synchronized XmlHandleManager getInstance() {
        if (instance == null) {
            instance = new XmlHandleManager();
        }
        return instance;
    }


    public Document getDocument(String path) {
        DocumentBuilder docBuild = null;
        Document doc = null;
        Manager m = new Manager();
        try {
            docBuild = dbf.newDocumentBuilder();
            doc = docBuild.parse(path);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return doc;
    }


    public void insert(Employee employee) {

    }


    public void update(Employee employee) {

    }

    public void delete(Employee employee) {

    }

    public void selectEmpployeeById() {

    }

    public void selectAll() {
        Document doc = getDocument("testXmlFile.xml");
        Node root = doc.getDocumentElement();
        ConsoleHelper.writelnMessage("Root element" + root.getLocalName());
        NodeList employees = root.getChildNodes();
        for (int i = 0; i < employees.getLength(); i++) {
            Node employee = employees.item(i);
            if (employee.getNodeType() == Node.ELEMENT_NODE) {
                Element employeeProps = (Element) employee;
                String employeeType = employeeProps.getAttribute("type");
                ConsoleHelper.writelnMessage("");
                ConsoleHelper.writelnMessage("######################################");
                ConsoleHelper.writelnMessage("EmployeeId: " + employeeProps.getAttribute("id"));
                ConsoleHelper.writelnMessage("EmployeeType: " + employeeType);
                ConsoleHelper.writelnMessage("======================================");
                if ("manager".equals(employeeType)) printManagerProps(employeeProps);
                if ("worker".equals(employeeType)) printWorkerProps(employeeProps);
                if ("other".equals(employeeType)) printOtherProps(employeeProps);
                ConsoleHelper.writelnMessage("======================================");
            }
        }
    }

    private void printManagerProps(Element manager) {
        ConsoleHelper.writelnMessage("First name: " + manager.getElementsByTagName("firstName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Second name: " + manager.getElementsByTagName("secondName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Patronymic: " + manager.getElementsByTagName("patronymic").item(0).getTextContent());
    }

    private void printWorkerProps(Element worker) {
        ConsoleHelper.writelnMessage("First name: " + worker.getElementsByTagName("firstName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Second name: " + worker.getElementsByTagName("secondName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Patronymic: " + worker.getElementsByTagName("patronymic").item(0).getTextContent());
    }

    private void printOtherProps(Element other) {
        ConsoleHelper.writelnMessage("First name: " + other.getElementsByTagName("firstName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Second name: " + other.getElementsByTagName("secondName").item(0).getTextContent());
        ConsoleHelper.writelnMessage("Patronymic: " + other.getElementsByTagName("patronymic").item(0).getTextContent());
    }


}
