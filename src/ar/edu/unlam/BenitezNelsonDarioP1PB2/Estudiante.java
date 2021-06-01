package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public abstract class Estudiante {

	private Integer DNI;
	private String apellido;
	private String nombre;
	
	public Estudiante(Integer dNI, String apellido, String nombre) {
		this.DNI = dNI;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public Integer getDNI() {
		return this.DNI;
	}
	public void setDNI(Integer dNI) {
		this.DNI = dNI;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
