package vista;

import controlador.MainControlador;
import processing.core.PApplet;

public class Main extends PApplet {

	private MainControlador mainControlador;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(800, 600);
	}

	public void setup() {
		mainControlador = new MainControlador(this);
	}

	public void draw() {
		background(0);
		mainControlador.pintar();
	}

}