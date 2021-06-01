package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public class Biblioteca {

	private  Libro[] Libros;

	private Integer cantidadLibrosPrestados = 0;
		
	public Biblioteca(Integer CantidadDeLibros) {
		this.Libros = new Libro[CantidadDeLibros];
	}
	
	
	public Boolean prestarLibro (Libro libroAPrestar, Estudiante estudiante) {
		
		this.cantidadLibrosPrestados++;
		return true;
	}
	
	public void devolverLibro (Libro libro) {
		this.cantidadLibrosPrestados--;
	}
	

	public Integer cantidadDeLibrosPrestados() {
	
		return this.cantidadLibrosPrestados;

	}

}
