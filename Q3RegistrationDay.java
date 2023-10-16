import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class Q3RegistrationDay{
    public static void main(String[] args) {
        // create objects
        Scanner scanner = new Scanner(System.in);
        
        // **** constants and variables ***
        int idNumber = 0;
        String day;
        
        System.out.println("enter your 5 digit ID number.");
        idNumber = scanner.nextInt();
        
        // get the registration day
        if(idNumber % 100 >= 80){
            day = "Monday";
        }
        else if((idNumber % 100 >= 60)){
            day = "Tuesday";
        }
        else if((idNumber % 100 >= 40)){
            day = "Wednesday";
        }
        else if((idNumber % 100 >= 20)){
            day = "Thursday";
        }
        else{
            day = "Friday";
        }
        
        System.out.println("Register on : " + day);
        
        // ** closing message ** Comment out if not needed
        System.out.println("end of program");
    }// end main
}// end public class
