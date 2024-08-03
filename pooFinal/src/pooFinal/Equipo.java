package pooFinal;

public class Equipo {
	private String name;
	private int golesEquipo;
    
    public Equipo(String name, int golesEquipo, ArrayList<Partido> partidosJugados, ArrayList<Jugador> jugadores) {
		super();
		this.name = name;
		this.golesEquipo = golesEquipo;
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
	
	 @Override
		public String toString() {
			return "Equipo [name=" + name + ", golesEquipo=" + golesEquipo + "]";
		}
	
}
