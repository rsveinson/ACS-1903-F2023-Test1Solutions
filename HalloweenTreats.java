 import java.util.Scanner;
/** 
 * ACS-1903 MidTerm 1 F2022 Q 2 key
 * @author Sveinson
*/

public class HalloweenTreats{
    public static void main(String[] args) {
        // 1 mark for the scanner and getting age from the keyboard
        // and the output
        
        Scanner scanner = new Scanner(System.in);
        
        String treat = "";
        System.out.println("enter you age.");
        int age = scanner.nextInt();
        
        // 3 marks for the nested if
        // -2 if it's not nested
        // -1 for extra test
        if(age < 18)
            treat = "Mars Bar";
        else
            if(age < 56)   // could also be (age <= 55)
                treat = "Bag of Chips";
            else
                treat = "Twizzlers";
        
        System.out.println("your treat is a " + treat);
        System.out.println("end of program");
    }
}
