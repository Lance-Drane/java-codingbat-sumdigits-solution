
import java.util.Scanner;

public class SimpleRecursionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a non-negative number: ");
        int n = input.nextInt();
        input.close();
        
        System.out.println("SUM OF DIGITS: " + sumDigits(n));
		
	}

    public static int sumDigits(int n) {
        
        if (n / 10 < 1) return n % 10;
        return sumDigits(n / 10) + sumDigits(n%10); 
         
     }	
	
}
