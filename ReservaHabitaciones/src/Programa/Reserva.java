package Programa;

public class Reserva {

	private int numReserva;
	private int fechaEntrada;
	private int fechaSalida;
	private int numPersona;
	
	/**
	 * constructor de la clase Reserva
	 */
	public Reserva () {
		
	}
	
	/**
	 * método que coge el num de la reserva
	 * @return el num de la reserva
	 */
	public int getNumReserva() {
		return numReserva;
	}

	/**
	 * método para introducir un num de reserva
	 * @param numReserva
	 */
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	/**
	 * método que coge el num de la persona
	 * @return el num de la persona
	 */
	public int getNumPersona() {
		return numPersona;
	}

	/**
	 * método para introducir el num de la persona
	 * @param numPersona
	 */
	public void setNumPersona(int numPersona) {
		this.numPersona = numPersona;
	}

	/**
	 * método que coge la fecha de entrada
	 * @return la fecha de entrada
	 */
	public int getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * método para introducir la fecha de entrada
	 * @param fechaEntrada
	 */
	public void setFechaEntrada(int fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * método que coge la fecha de salida
	 * @return la fecha de salida
	 */
	public int getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * método para introducir la fecha de salida
	 * @param fechaSalida
	 */
	public void setFechaSalida(int fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	
}
