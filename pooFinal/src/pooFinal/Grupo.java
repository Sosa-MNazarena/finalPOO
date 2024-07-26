package pooFinal;

public class Grupo {
	private ArrayList<Equipo> equiposConformados;
    private String nombreGrupo;
	public Grupo(ArrayList<Equipo> equiposConformados, String nombreGrupo) {
		super();
		this.equiposConformados = equiposConformados;
		this.nombreGrupo = nombreGrupo;
	}
	
	
	public ArrayList<Equipo> getEquiposConformados() {
		return equiposConformados;
	}
	public void setEquiposConformados(ArrayList<Equipo> equiposConformados) {
		this.equiposConformados = equiposConformados;
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	
	
	@Override
	public String toString() {
		return "Grupo [nombreGrupo=" + nombreGrupo + "]";
	}
    
    

}
