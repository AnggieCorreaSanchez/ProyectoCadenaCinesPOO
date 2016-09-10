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
public class Pelicula 
{
	private long codigo;
	private String nombre;
	private String descripcion;
	private List <Funcion> funciones;
	private CadenaCines cadenacine;
	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 */
	public Pelicula(long codigo, String nombre, String descripcion)
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.funciones = new ArrayList<Funcion>();
	}
	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the cadenacine
	 */
	public CadenaCines getCadenacine() {
		return cadenacine;
	}
	/**
	 * @param cadenacine the cadenacine to set
	 */
	public void setCadenacine(CadenaCines cadenacine) {
		this.cadenacine = cadenacine;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	
	{
		return String.format("%-20d %-20s %-30s" ,codigo,nombre,descripcion);
	}
	

	
	





}

