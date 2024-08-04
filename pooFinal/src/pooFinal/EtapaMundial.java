package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;

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

	 public void addPartidos(ArrayList<Equipo> equipos, ArrayList<LocalDate> fechas, int fechaIndex) {
		 int localFechaIndex = fechaIndex;
	        for (int i = 0; i < equipos.size(); i++) {
	            for (int j = i + 1; j < equipos.size(); j++) {
	            	if (fechaIndex >= fechas.size()) {
	                    fechaIndex = 0;
	                }
	                Equipo equipoLocal = equipos.get(i);
	                Equipo equipoVisitante = equipos.get(j);
	                
	                LocalDate fechaPartido = fechas.get(localFechaIndex);
	                Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, null);
	                this.partidos.add(partido);
	                fechaIndex++;
	            }
	        }
	    }
	 public void generarResultados() {
	        for (Partido partido : partidos) {
	            int golesLocal = (int) (Math.random() * 5);
	            int golesVisitante = (int) (Math.random() * 5);
	            Resultado resultado = new Resultado(golesLocal, golesVisitante);
	            partido.setResultado(resultado);
	        }
	    }

    public void imprimirPartidos() {
        System.out.println("-PARTIDOS DEL " + getDescripcionEtapa() + "-");
        for (Partido partido : this.partidos) {
        	LocalDate fechaPartido = partido.getFecha();
        	Resultado resultado = partido.getResultado();
        	 int golesLocal = resultado.getGolesLocal();
             int golesVisitante = resultado.getGolesVisitante();
            System.out.println("\n" + partido.getEquipoLocal().getName() + 
            		" vs " + partido.getEquipoVisitante().getName() + 
            		"\nFecha:" + fechaPartido +
            		"\nResultados: " + golesLocal + "-" + golesVisitante);
        }
        System.out.println();
    }
}
