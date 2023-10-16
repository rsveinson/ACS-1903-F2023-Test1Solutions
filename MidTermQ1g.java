import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class MidTermQ1g{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        
        while(n > 0){
            count = count + 1;
            n = scanner.nextInt();
        }
        System.out.println(count);

        System.out.println("end of program");
    }
}
