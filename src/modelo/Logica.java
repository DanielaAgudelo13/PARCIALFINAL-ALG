package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	private Marco marco;
	private ArrayList<Polo> polos;
	private PApplet app;
	private Mundo mundo;

	public Logica(PApplet app) {
		this.marco = new Marco(400, 300, 25, 8, 255, 0, 0, true, 0, false);
		this.app = app;
		this.polos = new ArrayList<Polo>();
		for (int i = 0; i < 20; i++) {
			int dirX = 1;
			int dirY = 1;
			if(i % 2 == 0) {
				dirX = -1;
			}
			if(i % 4 == 0) {
				dirX = -1;
			}
			this.polos.add(new Polo(50 + (100 * i), 50 + (50 * i), 25, 4, 0, 255, 0, true, 0, dirX, dirY));
		}
		this.mundo = new Mundo("", polos);
	}

	public void pintar() {
		this.marco.pintar(this.app);
		for (int i = 0; i < this.polos.size(); i++) {
			Polo polo = this.polos.get(i);
			polo.pintar(this.app);
			polo.mover(800, 600, this.app);
		}
		if(this.app.frameCount % 120 == 0) {
			this.mundo.setMensaje(this.marco.enviarMensaje());
		}	
		this.mundo.controlarMensaje(this.marco);
		borrarPolo();
	}
	
	public void borrarPolo() {
		for (int i = 0; i < polos.size(); i++) {
			Polo polo = polos.get(i);
			if(PApplet.dist(this.marco.getPosX(), this.marco.getPosY(), polo.getPosX(), polo.getPosY()) < 25 && this.marco.isEstaPersiguiendo()) {
				polo.setEstaVivo(false);
				polos.remove(i);
				this.marco.setEstaPersiguiendo(false);
			};
		}
	}
}
