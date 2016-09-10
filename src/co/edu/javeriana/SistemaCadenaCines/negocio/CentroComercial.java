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
public class CentroComercial 
{
	private String nombre;
	private CadenaCines cadena;
	private List <Cine> cines;

	/**
	 * @param nombre
	 */
	public CentroComercial(String nombre) {
		super();
		this.nombre = nombre;
		this.cines= new ArrayList<Cine>();
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
	 * @return the cines
	 */
	public List<Cine> getCines() {
		return cines;
	}

	/**
	 * @param cines the cines to set
	 */
	public void setCines(List<Cine> cines) {
		this.cines = cines;
	}

	/**
	 * @return the cadena
	 */
	public CadenaCines getCadena() {
		return cadena;
	}

	/**
	 * @param cadena the cadena to set
	 */
	public void setCadena(CadenaCines cadena) {
		this.cadena = cadena;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return String.format("%-20s %-30s",nombre,cines,cadena);
	}
	
}
