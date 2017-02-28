package utility;

import exceptions.ExitException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleHelper {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage(String text) {
        System.out.print(text);
    }

    public static void writelnMessage(String text) {
        writeMessage(text);
        System.out.println();
    }

    public static String readMessage() throws IOException {
        return reader.readLine();
    }

    public static int readInt() throws IOException, ExitException {
        String stringNum;
        while (true)   {
            stringNum = readMessage();
            if(stringNum.matches("\\d+")) break;
            if("exit".equals(stringNum)) throw new ExitException();
            writelnMessage("Invalid input! Enter number please...");
        }
        return Integer.parseInt(stringNum);
    }

    public static Date readDate() throws IOException, ParseException, ExitException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String stringDate;
        while (true)   {
            stringDate = readMessage();
            if(stringDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) break;
            if("exit".equals(stringDate)) throw new ExitException();
            writelnMessage("Invalid input! Enter date please...");
        }
        return sdf.parse(stringDate);
    }
}
