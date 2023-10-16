import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class MidTermQ1h{
    public static void main(String[] args) {
        String st = "To be or not to be";
        String word;
        Scanner scanner = new Scanner(st);
        
        while(scanner.hasNext()){
            word = scanner.next();
            System.out.print(word.charAt(0));
        }
        

        //System.out.println("end of program");
    }
}
