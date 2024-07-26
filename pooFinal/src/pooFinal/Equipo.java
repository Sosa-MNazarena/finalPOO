package pooFinal;

public class Equipo {
	private String name;
	private int golesEquipo;
    private ArrayList<Partido> partidosJugados;
    private ArrayList<Jugador> jugadores;
    
    public Equipo(String name, int golesEquipo, ArrayList<Partido> partidosJugados, ArrayList<Jugador> jugadores) {
		super();
		this.name = name;
		this.golesEquipo = golesEquipo;
		this.partidosJugados = partidosJugados;
		this.jugadores = jugadores;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGolesEquipo() {
		return golesEquipo;
	}
	public void setGolesEquipo(int golesEquipo) {
		this.golesEquipo = golesEquipo;
	}
	public ArrayList<Partido> getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	 @Override
		public String toString() {
			return "Equipo [name=" + name + ", golesEquipo=" + golesEquipo + "]";
		}
	
}
