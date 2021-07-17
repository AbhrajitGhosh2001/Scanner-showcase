
import java.util.Scanner;

public class HW2
{
	   public static void main (String [] args)
	   {
		   Scanner keyboard = new Scanner(System.in);
		   String secretPhrase= "pineapple";
		   String inputPhrase;
		   int x;
		   for(x=0;x<100;) {
		   System.out.print("Enter the phrase");
		      inputPhrase = keyboard.nextLine();
		      
		   if (inputPhrase.equalsIgnoreCase("pineapple")) {
			   System.out.println(secretPhrase);
		   }
			   else if (inputPhrase.equalsIgnoreCase("stop")) {
				  x=x+100;
			   }
		
		   }
	   }
}