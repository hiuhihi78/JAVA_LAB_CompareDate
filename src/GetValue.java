
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class GetValue {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInputString(String msg) {
        String result = null;
        // loop until user input correct
        while(true){
            System.out.print("Please enter the " + msg + ": ");
            result = scanner.nextLine().trim();
            if(result.isEmpty()){
                System.err.println("Invalid of " + msg + ", " + msg + " must be not empty!");
            }else{
                return result;
            }
        }
    }
    
}
