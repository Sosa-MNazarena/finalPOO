package pooFinal;

import java.util.ArrayList;

public class Llave {
	private ArrayList<Equipo> equiposEnfrentados;
    private String nombreEtapa;
    
	public Llave(ArrayList<Equipo> equiposEnfrentados, String nombreEtapa) {
		super();
		this.equiposEnfrentados = equiposEnfrentados;
		this.nombreEtapa = nombreEtapa;
	}

	public ArrayList<Equipo> getEquiposEnfrentados() {
		return equiposEnfrentados;
	}

	public void setEquiposEnfrentados(ArrayList<Equipo> equiposEnfrentados) {
		this.equiposEnfrentados = equiposEnfrentados;
	}

	public String getNombreEtapa() {
		return nombreEtapa;
	}

	public void setNombreEtapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}

	@Override
	public String toString() {
		return "Llave [equiposEnfrentados=" + equiposEnfrentados + ", nombreEtapa=" + nombreEtapa + "]";
	}
    
    
}
