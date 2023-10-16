import java.util.Scanner;
import javax.swing.JOptionPane;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
 */

public class Q1ShortAnswerQuestions2023{
    public static void main(String[] args) {
        // create objects
        //Scanner scanner = new Scanner(System.in);

        /* Q1a loop and if
         * 
         */
        int asum = 0;

        for(int i = 3; i < 15; i += 4){
            
            asum += i / 3;
            
        }// end for
        
        // for(int i = 3; i < 15; i += 2){
            // if(i % 3 == 0){
                // asum += i / 3;
            // }// end if
            // else{
                // asum += i * 3;
            // }// end else
        // }// end for

        System.out.println(asum);

        /* Q1b String replace and sub-string
         * 
         */
        String st = "My dog has no nose. No one knows.";
        st = st.replace("no", "***");
        System.out.println(st.substring(11, 20));

        /* Q1c compound logical expressoion
         * 
         */
        int a = 5;
        int b = 2;
        boolean c = false;
        boolean d = false;
        boolean tf = !(b <= a / b)&& c || d; 
        System.out.println(tf);

        /* Q1d div/mod expression
         * 
         */
        int an = 123456;
        int aa = an / 10 % 100;
        System.out.println(aa);

        /* Q1e nested if
         * 
         */
        int age = 34;

        if(age < 18){
            System.out.println("Junior");
        }
        else if(age < 55){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }

        /* Q1f simple while
         * 
         */
        int n = 0;
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        while(n != 0){
            sum += n * n;
            count++;
            n  = sc.nextInt();
        }//end while
        
        System.out.println(count);
        
        // *********** short code ***************
        /* Q2a simple expression
         * 
         */
        n = 0;
        sum = 0;
        //Scanner sc = new Scanner(System.in);

        // expected code
        System.out.println("find the sum of the first, how many?");
        n = sc.nextInt();

        sum = n * (n + 1) / 2;
        System.out.println(n + ": " + sum);

        /* Q2b simple loop or String
         * 
         */

        String strin;
        String message = "enter you password.";

        strin = JOptionPane.showInputDialog(message);

        if(strin.length() >= 8 && strin.length() <=15){
            System.out.println("Valid PW");
        }
        else{
            System.out.println("Invalid PW");
        }

        // ** closing message ** Comment out if not needed
        System.out.println("end of program");
    }// end main
}// end public class
