package pooFinal;

import java.util.ArrayList;

public class Grupo {
	private ArrayList<Equipo> equiposAgrupados;
    private String nombreGrupo;
	public Grupo( String nombreGrupo, ArrayList<Equipo> equiposAgrupados) {
		super();
		this.equiposAgrupados = equiposAgrupados;
		this.nombreGrupo = nombreGrupo;
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
		equiposAgrupados.add(equipo);
	}
	
	@Override
	public String toString() {
		return "Grupo [nombreGrupo=" + nombreGrupo + "]";
	}
    
    

}
