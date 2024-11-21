
public class Entrenador {
	private String nombre;
	private int edad;
	private int numtitulos;
	public Entrenador() {
	// contructor basio	
		
	}
	
	public Entrenador(String _nombre , int _edad, int _numtitulos){
		this.nombre = _nombre;
		this.edad = _edad;
		this.numtitulos = _numtitulos;
		
	}
	
	// creacion de los para leer get()
	
	public String getnombre() {return this.nombre;}
	public int getedad() {return this.edad;}
	public int getnumtitulos() {return this.numtitulos;}
	
	// modificiacion es set()

	public void setnombre(String nombre) {this.nombre = nombre;}
	public void setedad(int edad) {this.edad = edad;}
	public void setnumtitulos(int numtitulos) {this.numtitulos = numtitulos;}
}
