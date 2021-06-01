package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public class Biblioteca {

	private  Libro[] Libros;
	private  Prestamo[] prestamos;

	private Integer cantidadLibrosPrestados = 0;
		
	public Biblioteca(Integer CantidadDeLibros) {
		this.Libros = new Libro[CantidadDeLibros];
		this.prestamos = new Prestamo[CantidadDeLibros];
	}
	
	
	public Boolean prestarLibro (Integer Identificador, Libro libroAPrestar, Estudiante estudiante) {
		
		if (Identificador < this.prestamos.length)
		{
			if (!this.elLibroEstaPrestado(libroAPrestar))
			{
				if (this.cantidadDeLibrosEstudiante(estudiante) < 2)
				{
					this.prestamos[Identificador] = new Prestamo(Identificador,libroAPrestar, estudiante);
					
					this.cantidadLibrosPrestados++;
				}
			}
		}
		
		return true;
	}
	
	public void devolverLibro (Libro libro) {

		
		if (!this.elLibroEstaPrestado(libro))
		{
			 for ( Integer i = 0; i < this.prestamos.length; i++) {
					
				 if (this.prestamos[i].getLibro().getCodigo() == libro.getCodigo() )
				 {
					 
					this.prestamos[i] = null;
					
					this.cantidadLibrosPrestados--;

				 }
			 }

		}

		this.cantidadLibrosPrestados--;
	}
	

	public Integer cantidadDeLibrosPrestados() {
	
		return this.cantidadLibrosPrestados;

	}

	private Boolean elLibroEstaPrestado(Libro libroDevuelto)
	{
		 for ( Integer i = 0; i < this.prestamos.length; i++) {
		
			 if (this.prestamos[i].getLibro().getCodigo() == libroDevuelto.getCodigo() )
			 {
				 
				 return true;
			 }
		 }
		 
		return false;
	}
	
	private Integer cantidadDeLibrosEstudiante(Estudiante estudiante)
	{
		Integer cantidadDeLibrosQueTiene = 0;
		
		 for ( Integer i = 0; i < this.prestamos.length; i++) {
		
			 if (this.prestamos[i].getEstudiante().getDNI() == estudiante.getDNI() )
			 {
				 cantidadDeLibrosQueTiene++;
			 }
		 }
		 
		return cantidadDeLibrosQueTiene;
	}
}
