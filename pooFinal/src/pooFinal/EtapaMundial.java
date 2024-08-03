package pooFinal;

import java.util.ArrayList;

public class EtapaMundial {
	private String descripcionEtapa;
    private ArrayList<Partido> partidos;

	public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos) {
		super();
		this.descripcionEtapa = descripcionEtapa;
		this.partidos = partidos;
	}
	
	
	public String getDescripcionEtapa() {
		return descripcionEtapa;
	}
	public void setDescripcionEtapa(String descripcionEtapa) {
		this.descripcionEtapa = descripcionEtapa;
	}
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	
	@Override
	public String toString() {
		return "EtapaMundial [descripcionEtapa=" + descripcionEtapa + "]";
	}

	
}
