package pooFinal;

import java.util.ArrayList;

public class Equipo {
	private String name;
    private ArrayList<Partido> partidosJugados;
    
    public Equipo(String name, ArrayList<Partido> partidosJugados) {
		super();
		this.name = name;
		this.partidosJugados = partidosJugados;
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
	
	 @Override
		public String toString() {
			return "Equipo [name=" + name + "]";
		}
	
}
