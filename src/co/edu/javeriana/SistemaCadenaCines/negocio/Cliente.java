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
public class Cliente 
{
	private long CONSECUTIVO=0;
	private long id;
	private String nombre;
	private String email;
	private List <Boleta> boletas;
	private CadenaCines cadena;
	
	/**
	 * @param nombre
	 * @param email
	 * @param boletas
	 */
	public Cliente(String nombre, String email) {
		super();
		this.id = CONSECUTIVO++;
		this.nombre = nombre;
		this.email = email;
		this.boletas=new ArrayList<Boleta>();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the boletas
	 */
	public List<Boleta> getBoletas() {
		return boletas;
	}

	/**
	 * @param boletas the boletas to set
	 */
	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
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
	public String toString() {
		return String.format("%-20d %-20s %-20s" , id, nombre, email);
	}
	
	
	
	
}
