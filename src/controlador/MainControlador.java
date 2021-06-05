package controlador;

import modelo.Logica;
import processing.core.PApplet;

public class MainControlador {
	
	private Logica logica;
	
	public MainControlador(PApplet app) {
		this.logica = new Logica(app);
	}
	
	public void pintar() {
		this.logica.pintar();
	}
}
