package pooFinal;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{
	private ArrayList<Equipo> equiposAgrupados;
    private String nombreGrupo;
	
	public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposAgrupados,
			String nombreGrupo) {
		super(descripcionEtapa, partidos);
		this.equiposAgrupados = new ArrayList<>();
        this.partidos = new ArrayList<>();
	}
	
	
	public ArrayList<Equipo> getEquiposAgrupados() {
		return equiposAgrupados;
	}


	public void setEquiposAgrupados(ArrayList<Equipo> equiposAgrupados) {
		this.equiposAgrupados = equiposAgrupados;
	}


	public String getNombreGrupo() {
		return nombreGrupo;
	}


	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}


	public void addEquipo(Equipo equipo) {
		this.equiposAgrupados.add(equipo);
	}
	
	public void generarPartidos() {
        super.addPartidos(this.equiposAgrupados);
    }
	
	@Override
	public String toString() {
		return "Grupo [nombreGrupo=" + nombreGrupo + "]";
	}
	
	public ArrayList<Partido> getPartidos() {
        return partidos;
    }
	
	
    
    
    

}
