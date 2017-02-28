package company;

import exceptions.ExitException;
import utility.ConsoleHelper;
import utility.XmlManager;

public class CompanyController {
    private XmlManager xmlManager;

    public static void main(String[] args) {
        try {
            ConsoleHelper.writelnMessage("Welcome...");
            throw new ExitException();
        } catch (ExitException e){
            ConsoleHelper.writelnMessage("Goodbye...");
        }
    }
}
