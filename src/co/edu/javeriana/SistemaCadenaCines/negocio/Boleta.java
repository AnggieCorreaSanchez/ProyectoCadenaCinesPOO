/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.negocio;

/**
 * @author ANGGIE CORREA y CAMILO CALDERON
 *
 */
public class Boleta 
{
	private boolean comprada;
	private Cliente cliente;
	private Funcion funcion;
	private Silla silla;
	/**
	 * @param comprada
	 * @param funcion
	 */
	public Boleta(boolean comprada, Funcion funcion) {
		super();
		this.comprada = comprada;
		this.funcion = funcion;
	}
	/**
	 * @return the comprada
	 */
	public boolean isComprada() {
		return comprada;
	}
	/**
	 * @param comprada the comprada to set
	 */
	public void setComprada(boolean comprada) {
		this.comprada = comprada;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the funcion
	 */
	public Funcion getFuncion() {
		return funcion;
	}
	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	/**
	 * @return the silla
	 */
	public Silla getSilla() {
		return silla;
	}
	/**
	 * @param silla the silla to set
	 */
	public void setSilla(Silla silla) {
		this.silla = silla;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%-20s %-30s %-30s %-30s",comprada,cliente,funcion,silla);
	}
	
	
	
	
	
	
}
