package modelo;

import processing.core.PVector;

public class Marco extends Automata {

	private PVector direccion;
	private boolean estaPersiguiendo;

	public Marco(int posX, int posY, int radio, int velocidad, int red, int green, int blue, boolean estaVivo,
			float distancia, boolean estaPersiguiendo) {
		super(posX, posY, radio, velocidad, red, green, blue, estaVivo, distancia);
		// TODO Auto-generated constructor stub
		this.estaPersiguiendo = estaPersiguiendo;
		new Thread(this).start();
	}

	public void perseguir(Polo polo) {
		if (this.estaPersiguiendo) {
			this.direccion = new PVector(polo.getPosX() - this.posX, polo.getPosY() - this.posY);
			this.direccion.normalize();
			this.posX = this.posX + this.direccion.x * this.velocidad;
			this.posY = this.posY + this.direccion.y * this.velocidad;
		}
	}

	public String enviarMensaje() {
		return "Marco";
	}

	public PVector getDireccion() {
		return direccion;
	}

	public void setDireccion(PVector direccion) {
		this.direccion = direccion;
	}

	public boolean isEstaPersiguiendo() {
		return estaPersiguiendo;
	}

	public void setEstaPersiguiendo(boolean estaPersiguiendo) {
		this.estaPersiguiendo = estaPersiguiendo;
	}

}