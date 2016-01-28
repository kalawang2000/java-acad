import java.util.InputMismatchException;
import java.util.Scanner;


class primetest { 


	public boolean checkprime(int num1,int num2)
	{
		int i;
		for (int i=2;i<num1; i++) 
 			{ 	
			
			if (num1%num2==0)	
				return true; 
				break;
			else
				return false;	
			
			
 					{
			//			System.out.println("test");		
						bool=true ;
						break;
					}	
			//	System.out.println("test2 "+ i);			
 			} 
			
			
			
			
			
	}
  
	public static void main(String[] args) { 
		int num1=0;
		boolean  bool = false;
		
		primetest p = new primetest(); 
		
		Scanner in = new Scanner(System.in);
		//System.out.print("Please enter a number ");
        
		do {
			try {
				System.out.print("Please enter an integer: ");
				num1 = in.nextInt();
				} 
			catch (InputMismatchException e) {
				System.out.print("(Wrong input) ");
				}
				in.nextLine(); // clears the buffer
		} while (num1 <= 0);
		
		
		//num1 = in.nextInt();
		
		
		for (int i=2;i<num1; i++) 
 			{ 
		
			//	System.out.println(p.checkprime(num1,i));
				if (p.checkprime(num1,i) == true)
 					{
			//			System.out.println("test");		
						bool=true ;
						break;
					}	
			//	System.out.println("test2 "+ i);			
 			} 
	
 		if (bool==false) 
			System.out.println( num1 + " is a prime number");	
		else
			System.out.println(num1 + " is not a prime number");
     } 
}