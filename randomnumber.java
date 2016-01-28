import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;


public class randomnumber {
  
  public static void main(String... aArgs){
    int num1=0;
	boolean flag=false;
	
	Scanner in = new Scanner(System.in); 
	Random randomGenerator = new Random();
		
		do {
			try {
				if (flag==true)
						System.out.print("Wrong input!!! Please enter a positive integer: ");
				else
						System.out.print("Please enter a positive integer: ");
				num1 = in.nextInt();
				} 
			catch (InputMismatchException e) {
				System.out.print("(Wrong input) ");
				}
				in.nextLine(); 
				flag=true;
		} while (num1 <= 0);
		
		System.out.println("(random number is >=0 and <= " + num1 + ")   "+randomGenerator.nextInt(num1));

    }
    
      

  
  
}