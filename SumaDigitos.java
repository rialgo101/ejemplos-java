import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tarde
 *
 */
public class SumaDigitos {

	/
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("introduce un numero, por favor");
		int numero = sc.nextInt();
		// voy a ir sumando en un acumulador siempre el ultimo digito
		//cada vez que sume el ultimo digito lo elimino del numero
		// 1250 -> Acumilador = acumulador + 0
		//125 -> Acumulador = acumulador + 5
		// 1 -> Acumilador = acumulador + 2
	   // -> Acumulador = acumulador + 1
		// 0 FIN
		int acumulador=0;
		while(numero>0) {
			acumulador = acumulador + (numero/10);
			numero = numero / 10;
			System.out.printf("%d\n, numero");
		}
		System.out.printf("la suma de los digitos es: %d", acumulador);
	}

}
