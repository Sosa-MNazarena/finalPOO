package pooFinal;

import java.util.ArrayList;

public class Equipo {
	private String name;
    private ArrayList<Partido> partidosJugados;
    private int puntos;
    
    public Equipo(String name, ArrayList<Partido> partidosJugados) {
		super();
		this.name = name;
		this.partidosJugados = partidosJugados;
		this.puntos=0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Partido> getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	
	public int getPuntos() {
	    return puntos;
	}

    public void addPuntos(int puntos) {
        this.puntos += puntos;
    }
	
	 @Override
		public String toString() {
			return "Equipo [name=" + name + "]";
		}
	
}
