package pooFinal;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Llave extends EtapaMundial{
	private ArrayList<Equipo> equiposEnfrentados;
    private String nombreEtapa;
    
	public Llave(String descripcionEtapa, ArrayList<Partido> partidos, ArrayList<Equipo> equiposEnfrentados,
			String nombreEtapa) {
		super(descripcionEtapa, partidos);
		this.equiposEnfrentados = equiposEnfrentados;
		this.nombreEtapa = nombreEtapa;
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
    
    public void generarPartidosCuartos(ArrayList<Equipo> equiposQueAvanzan, ArrayList<LocalDate> fechasCuartos) {
        if (equiposQueAvanzan.size() < 8) {
            System.out.println("No hay suficientes equipos para generar cuartos.");
            return;
        }

        for (int i = 0; i < equiposQueAvanzan.size(); i += 2) {
            Equipo equipo1 = equiposQueAvanzan.get(i);
            Equipo equipo2 = equiposQueAvanzan.get(i + 1);
            this.partidos.add(new Partido(fechasCuartos.get(i / 2), equipo1, equipo2, null));

        }
    }
    public ArrayList<Equipo> getEquiposQueAvanzanDeCuartos(ArrayList<Equipo> todosLosEquipos) {
        ArrayList<Equipo> ganadores = new ArrayList<>();

        for (Partido partido : this.partidos) {
            String ganadorNombre = partido.getGanador();
            
            if (ganadorNombre != null && !ganadorNombre.equals("Empate")) {
                for (Equipo equipo : todosLosEquipos) {
                    if (equipo.getName().equals(ganadorNombre)) {
                        ganadores.add(equipo);
                        break;
                    }
                }
            }
        }
        return ganadores;
    }
    
    public void generarPartidosSemifinales(ArrayList<Equipo> equiposQueAvanzanDeCuartos, ArrayList<LocalDate> fechasSemifinales) {
        if (equiposQueAvanzanDeCuartos.size() < 4) {
            System.out.println("No hay suficientes equipos para generar semifinales.");
            return;
        }

        for (int i = 0; i < equiposQueAvanzanDeCuartos.size(); i += 2) {
            Equipo equipo1 = equiposQueAvanzanDeCuartos.get(i);
            Equipo equipo2 = equiposQueAvanzanDeCuartos.get(i + 1);
            this.partidos.add(new Partido(fechasSemifinales.get(i / 2), equipo1, equipo2, null));
            System.out.println("Generado partido: " + equipo1.getName() + " vs " + equipo2.getName());
        }
    }
    public ArrayList<Equipo> getEquiposQueAvanzanDeSemifinales(ArrayList<Equipo> equipos) {
        ArrayList<Equipo> ganadores = new ArrayList<>();

        for (Partido partido : this.partidos) {
            String ganadorNombre = partido.getGanador();

            if (ganadorNombre != null && !ganadorNombre.equals("Empate")) {
                for (Equipo equipo : equipos) {
                    if (equipo.getName().equals(ganadorNombre)) {
                        ganadores.add(equipo);
                        break;
                    }
                }
            }
        }
        
        return ganadores;
    }

    public void generarPartidoFinal(ArrayList<Equipo> equipos, LocalDate fechaFinal) {
    	 Equipo equipo1 = equipos.get(0);
         Equipo equipo2 = equipos.get(1);
         this.partidos.add(new Partido(fechaFinal, equipo1, equipo2, null));
    }
    public Equipo getGanadorFinal() {
        if (this.partidos.isEmpty()) {
            return null;
        }
        
        Partido finalPartido = this.partidos.get(0);
        String ganadorNombre = finalPartido.getGanador();
        
        for (Equipo equipo : this.equiposEnfrentados) {
            if (equipo.getName().equals(ganadorNombre)) {
                return equipo;
            }
        }
        return null;
    }

	 public void resolverEmpates() {
		    for (Partido partido : this.partidos) {
		        String ganador = partido.getGanador();
		        
		        if ("Empate".equals(ganador)) {
		            Equipo ganadorDesempate = Math.random() < 0.5 ? partido.getEquipoLocal() : partido.getEquipoVisitante();
		            partido.setGanador(ganadorDesempate.getName());
		            System.out.println("Desempate: El ganador del partido entre " + partido.getEquipoLocal().getName() 
		                + " y " + partido.getEquipoVisitante().getName() + " es " + ganadorDesempate.getName());
		        }
		    }
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


}
