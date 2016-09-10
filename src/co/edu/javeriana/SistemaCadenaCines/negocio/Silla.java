/**
 * 
 */
package co.edu.javeriana.SistemaCadenaCines.negocio;

/**
 * @author ANGGIE CORREA y CAMILO CALDERON
 *
 */
public class Silla 
{
	private String fila;
	private int numero;
	private Cine cine;
	
	/**
	 * @param fila
	 * @param numero
	 */
	public Silla(String fila, int numero) {
		super();
		this.fila = fila;
		this.numero = numero;
	}
	
	/**
	 * @return the fila
	 */
	public String getFila() {
		return fila;
	}

	/**
	 * @param fila the fila to set
	 */
	public void setFila(String fila) {
		this.fila = fila;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	
	public String toString() {
		return String.format("%-20s %-20d  ",fila,numero); 
	}
	
	
	
	
}
