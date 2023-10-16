import java.util.Scanner;
/** 
 * ACS-1903 Lab 4 Q9 key
 * @author Sveinson
*/

public class Q7WhileNestedIfMod3Code{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter positive numbers, -1 to quit");
        int n = scanner.nextInt();
        
        while(n != -1){            
            if(n % 3 == 0)
                System.out.print(n + " ");
            else
                System.out.print(" x ");
            n = scanner.nextInt();
        }
        
    }
}
