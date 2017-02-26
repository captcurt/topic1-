package topiconech2;
import java.util.Scanner;
		 
	public class caculatingtips {
	private static Scanner input;

	public static void main (String [] args) {
	 input = new Scanner(System.in);
     System.out.println("What to pay the server");
	 System.out.println("Enter the subtotal and a gratuity rate: ");
	    double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = gratuityRate/10;
		double total = subtotal + gratuity;
		         
		 System.out.printf ("The gratuity is $" + gratuity + " and total is $" + total + "\n");
		    }  
		}	     