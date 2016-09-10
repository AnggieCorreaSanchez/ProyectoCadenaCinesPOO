/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ANGGIE CORREA y CAMILO CALDERON
 *
 */
public class CadenaCines 
{
	private String nombre;
	private List<CentroComercial> centros;
	private List<Pelicula> peliculas;
	private List<Cliente> clientes;
	
	/**
	 * @param nombre
	 */
	public CadenaCines(String nombre) 
	{
		super();
		this.nombre = nombre;
		this.centros = new ArrayList <CentroComercial>();
		this.peliculas = new ArrayList <Pelicula>();
		this.clientes = new ArrayList <Cliente> ();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the centros
	 */
	public List<CentroComercial> getCentros() {
		return centros;
	}

	/**
	 * @param centros the centros to set
	 */
	public void setCentros(List<CentroComercial> centros) {
		this.centros = centros;
	}

	/**
	 * @return the peliculas
	 */
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	/**
	 * @param peliculas the peliculas to set
	 */
	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	/**
	 * @return the clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return String.format("%-20s  %-20s %-50s %-50s " , nombre  , centros, peliculas ,clientes);
	}
	
	
	
	
	
}
