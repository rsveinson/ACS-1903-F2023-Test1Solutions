import java.util.Scanner;
/** 
 * ACS-1903 Lab 4 Q9 key
 * @author Sveinson
*/

public class Q9ForLoopSumiCode{
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + i * i;
        }
        
        System.out.println(sum);

    }
}