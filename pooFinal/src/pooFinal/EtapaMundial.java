package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
	

    public ArrayList<Equipo> getEquiposQueAvanzanDeGrupos(ArrayList<Grupo> grupos) {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        for (Grupo grupo : grupos) {
            equiposQueAvanzan.addAll(grupo.getEquiposQueAvanzan());
        }
        return equiposQueAvanzan;
    }
    
    

}
