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
	                Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, new Resultado(i, j));
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

            String ganador;
            if (golesLocal > golesVisitante) {
                partido.getEquipoLocal().addPuntos(3);
                ganador = partido.getEquipoLocal().getName();
            } else if (golesLocal < golesVisitante) {
                partido.getEquipoVisitante().addPuntos(3);
                ganador = partido.getEquipoVisitante().getName();
            } else {
                partido.getEquipoLocal().addPuntos(1);
                partido.getEquipoVisitante().addPuntos(1);
                ganador = "Empate";
            }
            partido.setGanador(ganador);
        }
    }
	public void imprimirPartidos() {
        System.out.println("-PARTIDOS DE " + getDescripcionEtapa() + "-");

        String mensaje = "-PARTIDOS DE " + getDescripcionEtapa() + "-\n";
        
        for (Partido partido : this.partidos) {
        	
        	LocalDate fechaPartido = partido.getFecha();
        	Resultado resultado = partido.getResultado();
        	String ganador = partido.getGanador(); 
        	int golesLocal = resultado.getGolesLocal();
            int golesVisitante = resultado.getGolesVisitante();
            
            System.out.println("\n" + partido.getEquipoLocal().getName() + 
            		" vs " + partido.getEquipoVisitante().getName() + 
            		"\nFecha:" + fechaPartido +
            		"\nResultados: " + golesLocal + "-" + golesVisitante+
            		"\nGanador: "+ ganador);
            
            mensaje +=("\n" + partido.getEquipoLocal().getName() + 
            		" vs " + partido.getEquipoVisitante().getName() + 
            		"\nFecha:" + fechaPartido +
            		"\nResultados: " + golesLocal + "-" + golesVisitante+
            		"\nGanador: "+ ganador  + "\n---------------");
           
        }
        System.out.println();
        JOptionPane.showMessageDialog(null, mensaje, "Resultados del Grupo: " + getDescripcionEtapa(), JOptionPane.INFORMATION_MESSAGE);
        
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
	
	
	@Override
	public String toString() {
		return "GRUPO [nombreGrupo=" + nombreGrupo + "]";
	}
	
	public ArrayList<Partido> getPartidos() {
        return partidos;
    }

}
