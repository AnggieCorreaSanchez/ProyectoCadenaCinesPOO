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
public class Cine 
{
	private long CONSECUTIVO=1;
	private long id;
	private String sala;
	private long capacidad;
	private List <Funcion> funciones;
	private List <Silla> sillas;
	private CentroComercial centro;
	/**
	 * @param sala
	 * @param capacidad
	 */
	public Cine(String sala, long capacidad) {
		super();
		this.id = CONSECUTIVO++;
		this.sala = sala;
		this.capacidad = capacidad;
		this.funciones = new ArrayList<Funcion>();
		this.sillas = new ArrayList<Silla>();
		
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
	 * @return the sala
	 */
	public String getSala() {
		return sala;
	}
	/**
	 * @param sala the sala to set
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}
	/**
	 * @return the capacidad
	 */
	public long getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(long capacidad) {
		this.capacidad = capacidad;
	}
	
	/**
	 * @return the funciones
	 */
	public List<Funcion> getFunciones() {
		return funciones;
	}
	/**
	 * @param funciones the funciones to set
	 */
	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
	/**
	 * @return the sillas
	 */
	public List<Silla> getSillas() {
		return sillas;
	}
	/**
	 * @param sillas the sillas to set
	 */
	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}
	/**
	 * @return the centro
	 */
	public CentroComercial getCentro() {
		return centro;
	}
	/**
	 * @param centro the centro to set
	 */
	public void setCentro(CentroComercial centro) {
		this.centro = centro;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%-20d %-20s %-20d %-30s %-30s %-50s ",id,sala,capacidad,funciones,sillas,centro);
		
	}
	
	
	
	
	
	
}

