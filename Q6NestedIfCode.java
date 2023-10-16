import java.util.Scanner;
/** 
 * ACS-1903 Lab 4 Q9 key
 * @author Sveinson
*/

public class Q6NestedIfCode{
    public static void main(String[] args) {
    int x = 5;
        if (x == 5){
        System.out.println("x * 2 = 12");
    } else
        if(x > 10){
          System.out.print(x + " > 10");
          System.out.println (x * 3);
        }else{
        System.out.print('z');
        }

    }
}

