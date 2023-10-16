import java.util.Scanner;
/** 
 * ACS-1903 Lab 4 Q9 key
 * @author Sveinson
*/

public class MidTerm1Questions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String st;
        String ans;
        
        System.out.println("enter a string of 3 to 10 characters.");
        st = scanner.nextLine();
        
        
        if(st.length() <= 3){
            ans = "input too short";
        }// end too short
        else if(st.length() > 10){
            ans = "input too long";
        }// end too long
        else if(st.length() > 6){
            ans = st.substring(st.length() -3, st.length());
        }// end length 7 to 10
        else{
            ans = st.substring(0, 3);
        }// end length 0 to 3
        
        System.out.println(st);
        System.out.println(ans);
        
        int x = 10;
        
        if(x != 10 && x <= 50 || x < 15)
            System.out.println("valid");
        else
            System.out.println("invalid");
            
        // short answer q 1j
        int sum = 0;
        System.out.println("enter numbers 0 to end");
        int n = scanner.nextInt();
        
        while(n != 0){
            n = scanner.nextInt();
            sum += n;
        }
        System.out.println(sum);
        
        System.out.println("\nend of program");
    }
}