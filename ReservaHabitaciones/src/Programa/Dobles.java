package Programa;

public class Dobles extends Habitaciones {

	private boolean minibar;
	
	/**
	 * constructor de la clase Dobles
	 */
	public Dobles() {
		
	}
	
	
	/**
	 * @return si tiene minibar o no (V/F)
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**
	 * método para introducir si hay minibar o no
	 * @param minibar
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	/**
	 * @return el calculo de los descuentos en la habitación doble
	 */
	public int calculoDescuentos() {
		return (Integer) null;
	}
	
}
