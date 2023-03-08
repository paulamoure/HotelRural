package Programa;

public class Clientes {
	private int numCliente;
	private String nombre;
	private int telefono;
	
	/**
	 * constructor de la clase Clientes
	 */
	public Clientes() {
		
	}
	/**
	 * @return el num de la reserva para la h suite
	 */
	public int hacerReservaSuite() {
		return (Integer) null;
	}
	
	/**
	 * @return el num de la reserva para la h doble
	 */
	public int hacerReservaDoble() {
		return (Integer) null;
	}
	
	/**
	 * @return el num del cliente
	 */
	public int getNumCliente() {
		return numCliente;
	}
	
	/**
	 * método para introducir el num del cliente
	 * @param numCliente
	 */
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
	/**
	 * @return el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * método para introducir el nombre del cliente
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return el teléfono del cliente
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * método para introducir el num de teléfono del cliente
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
