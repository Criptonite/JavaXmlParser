package utility;

import company.Manager;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public final class XmlManager {
    private static XmlManager instance;

    private XmlManager(){}

    public synchronized XmlManager getInstance(){
        if(instance == null){
            instance = new XmlManager();
        }
        return instance;
    }



    public Document getDocument(String path) {
        DocumentBuilder docBuild = null;
        Document doc = null;
        Manager m = new Manager();
        try {
            docBuild = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc = docBuild.parse(path);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }


    public void insert(){

    }


    public void update(){

    }

    public void delete(){

    }

    public void selectEmpployeeById(){

    }




}
