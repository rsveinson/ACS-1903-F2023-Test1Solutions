import java.util.Scanner;
/** 
 * ACS-1903 MidTerm 1 F2022 Q 3 key
 * @author Sveinson
*/

public class SumOfInts{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int count = 1;
        
        System.out.println("enter a number.");
        n = scanner.nextInt();
        sum += n;
        while(sum <= 50 && count < 5){
            
            count++;
            
            System.out.println("enter a number.");
            n = scanner.nextInt();
            sum += n;
        }// end while
        
        System.out.println(count + " numbers = " + sum);

        System.out.println("\nend of program");
    }
}
