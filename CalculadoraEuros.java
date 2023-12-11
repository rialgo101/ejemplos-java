import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tarde
 *
 */
public class CalculadoraEuros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final double FACTOR_CONV = 166.386;
		
		System.out.println ("introduce una cantidad en pesetas");
		int pesetas = sc.nextInt();
		System.out.printf("la cantidad en en euros es %2f",(pesetas/FACTOR_CONV));
		


	}

}
