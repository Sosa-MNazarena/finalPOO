package pooFinal;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{
	private ArrayList<Equipo> equiposAgrupados;
    private String nombreGrupo;
	
	public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposAgrupados,
			String nombreGrupo) {
		super(descripcionEtapa, partidos);
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
	
	private static void crearPartidos(Grupo grupo) {
        ArrayList<Equipo> equipos = grupo.getEquiposAgrupados();

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);

                Partido partido = new Partido(new Date(), equipoLocal, equipoVisitante);
                grupo.getPartido().add(partido);
            }
        }
    }
    
    

}
