/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.presentacion;

import java.util.Scanner;

import co.edu.javeriana.SistemaCadenaCines.Persistencia.ManejoDeArchivos;
import co.edu.javeriana.SistemaCadenaCines.negocio.CadenaCines;
import co.edu.javeriana.SistemaCadenaCines.negocio.CentroComercial;

/**
 * @author ANGGIE CORREA y CAMILO CALDERON
 *
 */
public class TestCadenaClientes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		CadenaCines cadenaCines = new CadenaCines("Sistema Cines");
		Scanner sc=new Scanner(System.in);
		ManejoDeArchivos archivos= new ManejoDeArchivos();
		do
		{
			Menu(opcion);
			System.out.println("Digite la opcion que desea ejecutar\n");
			opcion=sc.nextInt();
			switch(opcion)
			{
			case 1:
				boolean resultado= archivos.ingresarCentroComercial(cadenaCines);
				
				break;
			case 2:

				break;
			case 3:
				String archivoCli;
				System.out.println("Ingrese el nombre del archivo de clientes a revisar, no olvidar escribir el .txt");
				archivoCli=sc.next();
				boolean resutaldo1=archivos.IngresarClientes(cadenaCines,archivoCli);
				break;
			case 4:
				String archivoPeli;
				System.out.println("Ingrese el nombre del archivo de peliculas a revisar, no olvidar escribir el .txt");
				archivoPeli = sc.next();
				boolean resultado2=archivos.IngresarPeliculas(cadenaCines,archivoPeli);

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;

			case 8:

				break;
			case 9:
				System.out.println("Fin Del Programa");
				break;
			default:
				System.out.println("Opcion Invalida");
				break;

			}
		}while(opcion != 9);

	}
	
		public static void Menu(int opcion)
		{
			
			System.out.println("\nSISTEMA CADENACINES");
			System.out.println("\nOpcion 1: ingresar centros comerciales, cines y sillas asociadas");
			System.out.println("\nOpcion 2: reporte de centros comerciales, cines y sillas asociadas");
			System.out.println("\nOpcion 3: ingresar clientes");
			System.out.println("\nOpcion 4: ingresar peliculas");
			System.out.println("\nOpcion 5: agregar una funcion asociada a una pelicula y a un cine");
			System.out.println("\nOpcion 6: consultar funciones para una pelicula");
			System.out.println("\nOpcion 7: comprar boletas para una funcion");
			System.out.println("\nOpcion 8: reporte de clientes con boletas compradas");
			System.out.println("\nOpcion 9: salir\n");
			
			
	}
}
