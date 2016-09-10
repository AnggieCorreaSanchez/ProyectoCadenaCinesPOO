/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.presentacion;

import java.time.LocalDate;
import java.util.StringTokenizer;

/**
 * @author ANGIE CORREA y CAMILO CALDERON
 *
 */
public class Utils {
	public static LocalDate convertirStringFecha (String fecha){

		StringTokenizer token;
		String dia;
		String mes;
		String anio;
		int anioInt;
		int mesInt;
		int diaInt;

		token = new StringTokenizer(fecha, "-");

		anio = token.nextToken();
		mes = token.nextToken();
		dia = token.nextToken();

		anioInt = Integer.parseInt(anio);
		mesInt = Integer.parseInt(mes);
		diaInt = Integer.parseInt(dia);

		return LocalDate.of(anioInt, mesInt, diaInt);
	}

}
