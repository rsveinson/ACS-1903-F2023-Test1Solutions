import java.util.Scanner;
/** 
 * ACS-1903 MidTerm 1 F2022 Q 3 key
 * @author Sveinson
*/

public class Q3BadWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        
        System.out.println("enter a number.");
        n = scanner.nextInt();
        
        while(n != 0){
                        
            n = scanner.nextInt();
            sum += n;
        }// end while
        
        System.out.println(sum);

        System.out.println("\nend of program");
    }
}
