package pooFinal;

import java.util.ArrayList;
import java.util.Date;

public class Partido {
	private Date fecha;
	private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Resultado resultado;
    
    public Partido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante, Resultado resultado) {
		super();
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.resultado = resultado;
	}
    
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
	
	
	@Override
	public String toString() {
		return "Partido [fecha=" + fecha + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", resultado=" + resultado + "]";
	}
	
	

	

}
