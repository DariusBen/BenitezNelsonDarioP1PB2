package ar.edu.unlam.BenitezNelsonDarioP1PB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestParcial1 {
	
	@Test
	public void queSePuedaCrearUnLibro() {
		
		Libro argentina = new Historia("111","Historia Argentina","Pepe Biondi");
		
		assertEquals("Pepe Biondi",argentina.getAutor());
	}


	@Test
	public void queSePuedaPrestarUnLibro() {

		Biblioteca biblioteca1 = new Biblioteca(2);
		
		Libro argentina = new Historia("111","Historia Argentina","Pepe Biondi");
		Libro numeros = new Matematica("222","Matematicas 1","Juan Topolean");
	
		Estudiante  pepe = new Estudiante(27308397,"Dario","Benitez");
		
		biblioteca1.agregarLibro(0, argentina);
		biblioteca1.agregarLibro(1, numeros);
		
		biblioteca1.prestarLibro(1, numeros, pepe);
		
		
		assertTrue(biblioteca1.cantidadDeLibrosPrestados() == 1);
				
	}

	@Test
	public void queSePuedaDevolverUnLibro() {
		Biblioteca biblioteca1 = new Biblioteca(2);
		
		Libro argentina = new Historia("111","Historia Argentina","Pepe Biondi");
		Libro numeros = new Matematica("222","Matematicas 1","Juan Topolean");
	
		Estudiante  pepe = new Estudiante(27308397,"Dario","Benitez");
		
		biblioteca1.agregarLibro(0, argentina);
		biblioteca1.agregarLibro(1, numeros);
		
		biblioteca1.prestarLibro(1, numeros, pepe);
		biblioteca1.devolverLibro(numeros);
		
		
		assertTrue(biblioteca1.cantidadDeLibrosPrestados() == 0);
				
	}

	@Test
	public void queSePuedaFotocopiarUnLibro() {

		Biblioteca biblioteca1 = new Biblioteca(2);
		
		Historia argentina = new Historia("111","Historia Argentina","Pepe Biondi");
		Matematica numeros = new Matematica("222","Matematicas 1","Juan Topolean");
	
		Estudiante  pepe = new Estudiante(27308397,"Dario","Benitez");
		
		biblioteca1.agregarLibro(0, argentina);
		biblioteca1.agregarLibro(1, numeros);
		
		assertTrue(argentina.Fotocopiar() != "");
				
		
	}

	@Test
	public void queNoSePuedaPrestarMasDeDosLibrosAUnEstudiante() {
				
	}

	
}
