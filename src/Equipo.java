
public class Equipo {
	
	private String nombre;
	private String estadio;
	private final int TOT_JUGADORES = 20;
	private final int TOT_TECNICOS = 2;
	
	public Jugador[] jugadores;
	public Entrenador[] Entrenadores;
	
	
	
	/* una de las formas para llamar los arrays
	private jugador[] jugador = new jugador[TOT_JUGADORES];
	private Entrenador []Enrenadores = new Entrenador[TOT_TECNICOS];
	*/
	
	public Equipo() {
		this.jugadores = new Jugador[TOT_JUGADORES];
		this.Entrenadores = new Entrenador[TOT_TECNICOS];
	}
	

	
	public Equipo(String nombre, String estadio, Jugador[] jugadores, Entrenador[] entrenadores) {
		
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = jugadores;
		this.Entrenadores = entrenadores;
	}

	public String getNombre() {return nombre;}

	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	

}
