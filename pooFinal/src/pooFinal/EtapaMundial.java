package pooFinal;

import java.util.ArrayList;
import java.util.Date;

public class EtapaMundial {
	private String descripcionEtapa;
    protected ArrayList<Partido> partidos;

	public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos) {
		super();
		this.descripcionEtapa = descripcionEtapa;
		this.partidos = new ArrayList<>();
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

	 public void addPartidos(ArrayList<Equipo> equipos) {
	        for (int i = 0; i < equipos.size(); i++) {
	            for (int j = i + 1; j < equipos.size(); j++) {
	                Equipo equipoLocal = equipos.get(i);
	                Equipo equipoVisitante = equipos.get(j);

	                Partido partido = new Partido(new Date(), equipoLocal, equipoVisitante, null);
	                this.partidos.add(partido);
	            }
	        }
	    }

    public void imprimirPartidos() {
        System.out.println("Partidos de " + getDescripcionEtapa() + ":");
        for (Partido partido : this.partidos) {
            System.out.println(partido.getEquipoLocal().getName() + " vs " + partido.getEquipoVisitante().getName());
        }
        System.out.println();
    }
}
