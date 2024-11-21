
public class Jugador {

	private String nombre;
	private Puesto posicion;
	private int numero;
	private int edad;
	private int golAVG = 0;
	private boolean activo;
	
	
	
	public Jugador() {
		this.numero = -1; // es un basio para ver si luego todos tienen numero
		this.activo = true;
	}//end jugador basio
	
	public Jugador(String _nombre,Puesto _posicion, int _numero, int _edad, int _golAVG, boolean _activo) {
		this.nombre = _nombre;
		this.posicion = _posicion;
		this.numero = _numero;
		this.edad = _edad;
		this.golAVG = _golAVG;
		this.activo = _activo;
		
	
	} // edn contructor

	//los get se ponen fuera del constructor y es para leer
	public String getnombre() 			{return this.nombre;}
	public Puesto getposicion()		 	{return this.posicion;}
	public int getedad() 				{return this.edad;}
	public int getnumero() 				{return this.numero;}
	public int getgolAVG() 				{return this.golAVG;}
	
	public boolean isActivo() {return this.activo;} // preguntar por q se usa el is y  no el get
	
	// para escrrbir (set)
	public void setnombre(String nombre) 				{this.nombre = nombre;}
	public void setposicion(Puesto posicion) 			{this.posicion = posicion;}
	public void setnumero(int numero) 					{this.numero = numero;}
	public void setedad(int edad) 						{this.edad = edad;}
	public void setgolAVG(int golAVG) 					{this.golAVG = golAVG;}

	public void setactivo(boolean activo) {this.activo = activo;}
	
	
	
	
	
	
	
	
	
}// endClass
