package company;

import utility.ConsoleHelper;
import utility.XmlHandleManager;

public class CompanyController {
    private static XmlHandleManager xmlHandleManager = XmlHandleManager.getInstance();

    public static void main(String[] args) {
        ConsoleHelper.writelnMessage("Welcome...");
        xmlHandleManager.selectAll();
    }
}
