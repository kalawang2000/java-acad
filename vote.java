import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
		int age;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your age ");
        age = in.nextInt();
		
		if (age >= 18) {
             System.out.println("You are eligible to vote.");
        } 
			else  {
        
				System.out.println("Sorry you are not eligible to vote");
        }
		
		

    }
}