package modelo;

import processing.core.PApplet;

public class Polo extends Automata {

	private int direccionX;
	private int direccionY;

	public Polo(int posX, int posY, int radio, int velocidad, int red, int green, int blue, boolean estaVivo, float distancia,
			int direccionX, int direccionY) {
		super(posX, posY, radio, velocidad, red, green, blue, estaVivo, distancia);
		// TODO Auto-generated constructor stub
		this.direccionX = direccionX;
		this.direccionY = direccionY;
		new Thread(this).start();
	}

	public void mover(int ancho, int alto, PApplet app) {
		if (app.frameCount % 180 == 0) {
			this.direccionX *= -1;
			this.direccionY *= -1;
		}

		this.posX += this.velocidad * this.direccionX;
		this.posY += this.velocidad * this.direccionY;

		if (this.posX > ancho) {
			setPosX(0);
		}

		if (this.posX < 0) {
			setPosX(ancho);
		}

		if (this.posY > alto) {
			setPosY(0);
		}

		if (this.posY < 0) {
			setPosY(alto);
		}
	}

	public int getDireccionX() {
		return direccionX;
	}

	public void setDireccionX(int direccionX) {
		this.direccionX = direccionX;
	}

	public int getDireccionY() {
		return direccionY;
	}

	public void setDireccionY(int direccionY) {
		this.direccionY = direccionY;
	}

}