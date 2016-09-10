package co.edu.javeriana.SistemaCadenaCines.Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import co.edu.javeriana.SistemaCadenaCines.negocio.CadenaCines;
import co.edu.javeriana.SistemaCadenaCines.negocio.CentroComercial;
import co.edu.javeriana.SistemaCadenaCines.negocio.Cine;
import co.edu.javeriana.SistemaCadenaCines.negocio.Cliente;
import co.edu.javeriana.SistemaCadenaCines.negocio.Pelicula;
import co.edu.javeriana.SistemaCadenaCines.negocio.Silla;

public class ManejoDeArchivos {
	public static boolean ingresarCentroComercial(CadenaCines cadenaCines) 
	{
		File inFile = new File("./centroComercial.txt");
		Scanner input = null;
		String linea;
		try {
			input = new Scanner(inFile);
			input.nextLine();
			linea = input.nextLine().trim();
			System.out.println("0");
			while (!linea.equals("#FIN")&& input.hasNextLine()) {
				linea = input.nextLine().trim();
				System.out.println("1");
				String nombre = linea;
				CentroComercial centroComercial = new CentroComercial(nombre);
				System.out.println("Nombre del centro comercial: " + nombre);
				linea = input.nextLine().trim();
				System.out.println("2");
				linea = input.nextLine().trim();
				System.out.println("3");
				List<Cine> cines= new ArrayList<Cine>();
				while (!linea.equals("#FIN CENTRO")) {
					linea = input.nextLine().trim();
					System.out.println("4");
					String sala = linea;
					StringTokenizer token = new StringTokenizer(sala, "*");
					String nombreSala = token.nextToken().trim();
					System.out.print("Sala: " + nombreSala);
					Long capacidad = Long.parseLong(token.nextToken()
							.trim());
					System.out.println(" capacidad: " + capacidad);
					Cine objCine = new Cine(nombreSala, capacidad);
					cines.add(objCine);
					linea = input.nextLine().trim();
					linea = input.nextLine().trim();
					linea = input.nextLine().trim();
					while (!linea.equals("0")) {
						String silla = linea;
						StringTokenizer token1 = new StringTokenizer(silla,
								"*");
						String fila = token1.nextToken().trim();
						System.out.print("Silla en la fila: " + fila);
						int numero = Integer.parseInt(token1.nextToken()
								.trim());
						System.out.println(" numero: " + numero);
						Silla objSilla = new Silla(fila, numero);
						linea = input.nextLine().trim();
						System.out.println("8");

					}
					linea = input.nextLine().trim();
					System.out.println("9");
				}
				linea = input.nextLine().trim();
				System.out.println("10");
				if (input.hasNextLine())
				{
					linea = input.nextLine().trim();
					System.out.println("11");
				}
			}

			linea = input.nextLine().trim();
			System.out.println("12");
			return true;
		} catch (Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
		} finally {
			input.close();
		}
		return false;
	}

	public static boolean IngresarClientes(CadenaCines cadenaCines,
			String archivoCli) {
		// String archivo="clientes.txt";
		File inFile = new File("./" + archivoCli);
		Scanner input = null;
		String linea;
		try {
			input = new Scanner(inFile);
			input.nextLine();
			linea = input.nextLine().trim();

			List<Cliente> clientes = new ArrayList<Cliente>();
			linea = input.nextLine().trim();
			long id = 0;
			while (!linea.equals("#FIN")) {

				String cliente = linea;
				StringTokenizer token = new StringTokenizer(cliente, "*");
				String nombre = token.nextToken().trim();
				System.out.println("nombre " + nombre);
				String correo = token.nextToken().trim();
				System.out.println("Correo " + correo);
				Cliente objCliente = new Cliente(nombre, correo);
				id++;
				objCliente.setId(id);
				clientes.add(objCliente);
				System.out.println(objCliente.toString());
				linea = input.nextLine().trim();
			}
			System.out.println("holi");
			cadenaCines.setClientes(clientes);
			System.out.println(clientes.toString());

			return true;
		} catch (Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
			return false;
		} finally {
			input.close();
		}
	}

	public static boolean IngresarPeliculas(CadenaCines cadenaCines,
			String archivoPeli) {

		File inFile = new File("./peliculas.txt");
		Scanner input = null;
		String linea;
		try {
			input = new Scanner(inFile);
			input.nextLine();
			linea = input.nextLine().trim();

			List<Pelicula> peliculas = new ArrayList<Pelicula>();
			linea = input.nextLine().trim();

			while (!linea.equals("#FIN")) {

				String pelicula = linea;
				StringTokenizer token = new StringTokenizer(pelicula, "*");
				Long codigo = Long.parseLong(token.nextToken().trim());

				System.out.println("codigo " + codigo);
				String nombre = token.nextToken().trim();
				System.out.println("nombre " + nombre);
				String descripcion = token.nextToken().trim();
				System.out.println("descripcion " + descripcion);
				Pelicula objPelicula = new Pelicula(codigo, nombre, descripcion);

				peliculas.add(objPelicula);
				System.out.println(objPelicula.toString());
				linea = input.nextLine().trim();
			}
			System.out.println("holi");
			cadenaCines.setPeliculas(peliculas);
			System.out.println(peliculas.toString());

			return true;
		} catch (Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
			return false;
		} finally {
			input.close();
		}
	}
}
