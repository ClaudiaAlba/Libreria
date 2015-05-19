package modelo.entidad;

public class Libro {

	private int numeroVentas;
	private String nombre;
	private String descripcion;
	private double valor;
	private Genero genero;
	public int id;
	private static int idLibro;
	
	public Libro(String nombre, String descripcion, double valor, Genero genero) {
		this.id = idLibro;
		idLibro++;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valor = valor;
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getNumeroVentas() {
		return numeroVentas;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}	
}
