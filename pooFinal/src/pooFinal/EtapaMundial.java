package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EtapaMundial {
	private String descripcionEtapa;
    protected ArrayList<Partido> partidos;
    private int fechaIndex;

	public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos) {
		super();
		this.descripcionEtapa = descripcionEtapa;
		this.partidos = new ArrayList<>();
		this.fechaIndex = 0;
	}
	
    public int getFechaIndex() {
        return fechaIndex;
    }

    public void setFechaIndex(int fechaIndex) {
        this.fechaIndex = fechaIndex;
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

	 public void addPartidos(ArrayList<Equipo> equipos, ArrayList<LocalDate> fechas) {
		 int fechaIndex = 0;
	        for (int i = 0; i < equipos.size(); i++) {
	            for (int j = i + 1; j < equipos.size(); j++) {
	            	if (fechaIndex >= fechas.size()) {
	                    fechaIndex = 0;
	                }
	                Equipo equipoLocal = equipos.get(i);
	                Equipo equipoVisitante = equipos.get(j);
	                
	                LocalDate fechaPartido = fechas.get(fechaIndex);
	                Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, null);
	                this.partidos.add(partido);
	                fechaIndex++;
	            }
	        }
	    }

    public void imprimirPartidos() {
        System.out.println("Partidos del " + getDescripcionEtapa() + ":");
        for (Partido partido : this.partidos) {
        	LocalDate fechaPartido = partido.getFecha();
            System.out.println("\n" + partido.getEquipoLocal().getName() + " vs " + partido.getEquipoVisitante().getName() + "\nFecha:" + fechaPartido);
        }
        System.out.println();
    }
}
