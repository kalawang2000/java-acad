import java.util.Scanner;
 
class daysofmonth
{
   public static void main(String args[])
   {
	  
      int m, dayn=0;
	  String mn="";
      System.out.println("Enter month 1-12");
      Scanner in = new Scanner(System.in);
      m = in.nextInt();
     
      switch(m) {
		  case 1:  mn="January";dayn = 31;
                     break;
            case 2: mn="February"; dayn = 29;
                     break;
            case 3: mn="March"; dayn = 31;
                     break;
            case 4: mn="April"; dayn = 30;
                     break;
            case 5: mn="May"; dayn = 31;
                     break;
            case 6: mn="June"; dayn = 30;
                     break;
            case 7: mn="July"; dayn = 31;
                     break;
            case 8: mn="August"; dayn = 31;
                     break;
            case 9: mn="September"; dayn = 30;
                     break;
            case 10: mn="October"; dayn = 31;
                     break;
            case 11: mn="November";dayn = 30;
                     break;
            case 12: mn="December";dayn = 31;
                     break;
			default: mn = "Invalid month";
                     break;
	   
		
	  }
	  
	  
      System.out.println("number of days for the month of "+ mn + " are " + dayn);
   }
}