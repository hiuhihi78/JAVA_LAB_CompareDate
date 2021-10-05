
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class CompareDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input frist date
        String fristDate = inputDate("frist date");
        // input second date
        String secondDate = inputDate("second date");
        // compare and display
        compareAndDisplay(fristDate, secondDate);
    }

    public static String inputDate(String string) {
        // loop until user input correct
        while (true) {
            // input date
            String date = GetValue.getInputString(string);
            // check valid format
            boolean dateFormat = Validation.checkStringValidFormatDate(date);
            // check date existed
            boolean dateExisted = Validation.checkDateExited(date);
            if (dateFormat == false) {
                System.out.println("fomat");
            } else if (dateExisted == false) {
                System.out.println("exit");
            } else if (dateFormat == true && dateExisted == true) {
                return date;
            }
        }
    }

    public static void compareAndDisplay(String date_1, String date_2) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date fristDate = null;
        Date secondDate = null;
        try {
            fristDate = dateFormat.parse(date_1);
            secondDate = dateFormat.parse(date_2);
        } catch (Exception e) {
        }
        System.out.println("");
        if (fristDate.compareTo(secondDate) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (fristDate.compareTo(secondDate) == 0) {
            System.out.println("Date1 is equal Date2");
        } else {
            System.out.println("Date1 is after Date2");
        }
    }

}
