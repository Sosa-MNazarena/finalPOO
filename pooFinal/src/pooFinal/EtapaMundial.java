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
	                Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, null);
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
        System.out.println("-PARTIDOS DEL " + getDescripcionEtapa() + "-");

        String mensaje = "-PARTIDOS DEL " + getDescripcionEtapa() + "-\n";
        
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
    
    public ArrayList<Equipo> getEquiposQueAvanzanDeGrupos(ArrayList<Grupo> grupos) {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        for (Grupo grupo : grupos) {
            equiposQueAvanzan.addAll(grupo.getEquiposQueAvanzan());
        }
        return equiposQueAvanzan;
    }
    
    public void generarPartidosOctavos(ArrayList<Equipo> equiposQueAvanzan, ArrayList<LocalDate> fechas) {
        if (equiposQueAvanzan.size() < 16) {
            System.out.println("No hay suficientes equipos para generar octavos.");
            return;
        }

        for (int i = 0; i < equiposQueAvanzan.size(); i += 4) {
            Equipo equipo1 = equiposQueAvanzan.get(i);
            Equipo equipo2 = equiposQueAvanzan.get(i + 3);
            this.partidos.add(new Partido(fechas.get(i / 2), equipo1, equipo2, null));

            Equipo equipo3 = equiposQueAvanzan.get(i + 1);
            Equipo equipo4 = equiposQueAvanzan.get(i + 2);
            this.partidos.add(new Partido(fechas.get(i / 2 + 1), equipo3, equipo4, null));
        }
    }
    
    public void generarPartidosCuartos(ArrayList<Equipo> equiposQueAvanzan, ArrayList<LocalDate> fechas) {
        if (equiposQueAvanzan.size() < 8) {
            System.out.println("No hay suficientes equipos para generar cuartos.");
            return;
        }

        for (int i = 0; i < 8; i += 2) {
            Equipo equipo1 = equiposQueAvanzan.get(i);
            Equipo equipo2 = equiposQueAvanzan.get(i + 1);
            this.partidos.add(new Partido(fechas.get(i / 2), equipo1, equipo2, null));

        }
    }
    
}
