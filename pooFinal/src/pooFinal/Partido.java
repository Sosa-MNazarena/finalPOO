package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partido {
	private LocalDate fecha;
	private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Resultado resultado;
    private String ganador; 
    

	public Partido(LocalDate fecha, Equipo equipoLocal, Equipo equipoVisitante, Resultado resultado) {
		super();
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.resultado = resultado;
		this.ganador = null; 
	}
    
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	
	@Override
	public String toString() {
		return "Partido [fecha=" + fecha + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", resultado=" + resultado + "]";
	}
	
	

	

}
