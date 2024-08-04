package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Grupo extends EtapaMundial{
	private ArrayList<Equipo> equiposAgrupados;
    private String nombreGrupo;
	
	public Grupo(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposAgrupados,
			String nombreGrupo) {
		super(descripcionEtapa, partidos);
		this.equiposAgrupados = new ArrayList<>();
        this.partidos = new ArrayList<>();
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
		this.equiposAgrupados.add(equipo);
	}
	
	public ArrayList<Equipo> getEquiposQueAvanzan(){
		Equipo max1 = null;
        Equipo max2 = null;

        for (Equipo equipo : equiposAgrupados) {
            if (max1 == null || equipo.getPuntos() > max1.getPuntos()) {
                max2 = max1;
                max1 = equipo;
            } else if (max2 == null || equipo.getPuntos() > max2.getPuntos()) {
                max2 = equipo;
            }
        }

        ArrayList<Equipo> avanzan = new ArrayList<>();
        if (max1 != null) avanzan.add(max1);
        if (max2 != null) avanzan.add(max2);

        return avanzan;
	}
	
	 public void generarPartidos(ArrayList<LocalDate> fechas, int fechaIndex) {
	        super.addPartidos(this.equiposAgrupados, fechas, fechaIndex);
	    }
	@Override
	public String toString() {
		return "GRUPO [nombreGrupo=" + nombreGrupo + "]";
	}
	
	public ArrayList<Partido> getPartidos() {
        return partidos;
    }


	public void imprimirPuntos() {
		String mensaje = "-PUNTOS DEL " + this.getNombreGrupo() + "-\n";
		
		for (Equipo equipo : this.getEquiposAgrupados()){
		mensaje += equipo.getName() + " - " + equipo.getPuntos() + " puntos\n";
	}
	
	 JOptionPane.showMessageDialog(null, mensaje, "Puntos de Equipos", JOptionPane.INFORMATION_MESSAGE);
    
	}
}
