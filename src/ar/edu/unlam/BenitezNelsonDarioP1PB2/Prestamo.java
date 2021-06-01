package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public class Prestamo {


	private Integer Identificador;
	private Libro libro;
	private Estudiante estudiante;
	

	
	
	public Prestamo(Integer identificador, Libro libro, Estudiante estudiante) {
		this.Identificador = identificador;
		this.libro = libro;
		this.estudiante = estudiante;
	}
	
	public Integer getIdentificador() {
		return this.Identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.Identificador = identificador;
	}
	public Libro getLibro() {
		return this.libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Estudiante getEstudiante() {
		return this.estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	
	
}
