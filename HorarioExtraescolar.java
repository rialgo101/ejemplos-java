import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tarde
 *
 */
public class HorarioExtraescolar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println ("introduce un dia de la samana, por favor");
		String[][] horario = {
				{"Lunes","psicomotricidad"},
				{"Martes","Natacion"},
				{"Miercoles","Musica"},
				{"Jueves","Natacion"},
				{"Viernes","Descanso"},
				{"Sabado","Dia sin actividades"},
				{"Domingo","Dia si actividades"},
				
		};
		
		
for (int i = 0; i < horario.length; i++) {
	System.out.println("\nhorario para " + horario [i][0] +":");
	for (int j = 1; j < horario[i].length; j++) {
		System.out.println("Clase" + j + ":" + horario[i][j]);
	}
	}

	}

}
