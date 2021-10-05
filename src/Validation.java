
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
class Validation {

    public static boolean checkStringValidFormatDate(String string) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkDateExited(String string) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
