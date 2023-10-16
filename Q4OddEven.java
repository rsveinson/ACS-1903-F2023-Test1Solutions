import java.util.Scanner;
/** 
 * ACS-1903 MidTerm 1 F2022 Q 3 key
 * @author Sveinson
*/

public class Q4OddEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("enter number, -1 to quit");
        n = scanner.nextInt();
        
        while(n != -1){
            
            if(n % 2 == 0){
                evenCount = evenCount + 1;
            }// end even
            else{
                oddCount++;
            }// end odd
            
            //System.out.println("enter a number.");
            n = scanner.nextInt();
        }// end while
        
        System.out.println(evenCount + "  even numbers");
        System.out.println(oddCount + "  odd numbers");

        System.out.println("\nend of program");
    }
}
