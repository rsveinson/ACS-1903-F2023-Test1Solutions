import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class MidTerm1Q1f{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 0;
        int x = 571305;
        
        if(x % 10 ==0){
            n = x % 100;
        }
        else if(x % 5 == 0){
            n = x / 100;
        }
        else{
            n = x %  10;
        }
        System.out.println("n = " + n);

        System.out.println("end of program");
    }
}
