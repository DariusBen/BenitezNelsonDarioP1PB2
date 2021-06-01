package ar.edu.unlam.BenitezNelsonDarioP1PB2;

public class Historia extends Libro implements IFotocopiable{

	public Historia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String Fotocopiar() {
		return "Este es un libro de Historia";
	}
	
}
