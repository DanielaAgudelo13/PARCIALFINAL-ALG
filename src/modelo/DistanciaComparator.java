package modelo;

import java.util.Comparator;

public class DistanciaComparator implements Comparator<Polo> {

	@Override
	public int compare(Polo o1, Polo o2) {
		// TODO Auto-generated method stub
		float distancia1 = o1.getDistancia();
		float distancia2 = o2.getDistancia();
		if (distancia1 < distancia2) return -1;
		if (distancia1 > distancia2) return 1;
		return 0;
	}
}
