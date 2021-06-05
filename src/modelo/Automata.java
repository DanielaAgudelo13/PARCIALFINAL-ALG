package modelo;

import processing.core.PApplet;

public class Automata implements Runnable {

	protected float posX;
	protected float posY;
	protected int radio;
	protected int velocidad;
	protected int red;
	protected int green;
	protected int blue;
	protected boolean estaVivo;
	protected float distancia;

	public Automata(int posX, int posY, int radio, int velocidad, int red, int green, int blue, boolean estaVivo, float distancia) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.radio = radio;
		this.velocidad = velocidad;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.estaVivo = estaVivo;
		this.distancia = distancia;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (this.estaVivo) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void pintar(PApplet app) {
		app.fill(this.red, this.green, this.blue);
		app.ellipse(this.posX, this.posY, this.radio * 2, this.radio * 2);
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
}
