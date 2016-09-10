/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.negocio;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author ANGGIE CORREA y CAMILO CALDERON
 *
 */
public class Funcion 
{
	private long CONSECUTIVO=1;
	private long id;
	private LocalDateTime fecha;
	private long tarifa;
	private List <Boleta> boletas;
	private Cine cine;
	private Pelicula pelicula;
	
	
	/**
	 * @param id
	 * @param fecha
	 * @param tarifa
	 * @param boletas
	 */
	public Funcion(long id, LocalDateTime fecha, long tarifa,List<Boleta> boletas) {
		super();
		
		this.id = CONSECUTIVO++;
		this.fecha = fecha;
		this.tarifa = tarifa;
		this.boletas = boletas;
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
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the tarifa
	 */
	public long getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(long tarifa) {
		this.tarifa = tarifa;
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
	 * @return the cine
	 */
	public Cine getCine() {
		return cine;
	}
	/**
	 * @param cine the cine to set
	 */
	public void setCine(Cine cine) {
		this.cine = cine;
	}
	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}
	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public String toString() {
		return String.format("%-20d %-20d %-30d %-20s %-30s %-30s %-30s",CONSECUTIVO,id,tarifa,fecha,cine,pelicula,boletas);
	}
	
	
	
	
	
	
	
}
