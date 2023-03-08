package Programa;

public class Habitaciones {

	private boolean estado;
	private int numCamas;
	private int numHabitacion;
	
	/**
	 * constructor de la clase Habitaciones
	 */
	public Habitaciones() {
		
	}
	
	/**
	 * @return el num de la habitación
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * método para introducir un num de habitación
	 * @param numHabitacion
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	/**
	 * @return si el estado es verdadero o falso
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * método para introducir el estado
	 * @param estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return el num de camas
	 */
	public int getNumCamas() {
		return numCamas;
	}

	/**
	 * método para introducir el num de camas
	 * @param numCamas
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

}
