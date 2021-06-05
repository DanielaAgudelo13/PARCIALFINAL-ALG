package modelo;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

public class Mundo {

	private String mensaje;
	private ArrayList<Polo> polos;

	public Mundo(String mensaje, ArrayList<Polo> polos) {
		this.mensaje = mensaje;
		this.polos = polos;
	}

	public void controlarMensaje(Marco marco) {
		if (this.mensaje == "Marco") {
			System.out.println(this.mensaje);
			for (int i = 0; i < this.polos.size(); i++) {
				Polo polo = this.polos.get(i);
				float distanciaPolo = PApplet.dist(marco.getPosX(), marco.getPosY(), polo.getPosX(), polo.getPosY());
				polo.setDistancia(distanciaPolo);
			}
			Collections.sort(this.polos, new DistanciaComparator());
			marco.setEstaPersiguiendo(true);
			this.mensaje = "";
		}

		if (this.polos.size() > 0) {
			marco.perseguir(polos.get(0));
		}
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
