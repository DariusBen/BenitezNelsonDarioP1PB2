package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public class Geografia extends Libro implements IFotocopiable{

	public Geografia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String Fotocopiar() {
		return "Este es un libro de Geografia";
	}

	
	
	
}
