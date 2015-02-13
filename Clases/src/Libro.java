
public class Libro {
	
	//atributos
	private String titulo;
	private String autor;
	private int anyo;
	private String editorial;
	private String isbn;

	//constructores
	public Libro(String valorisbn){
		isbn=valorisbn;
		
	}
	public Libro (String valortitulo, String valorautor, int valoranyo, String	valoreditorial, String valorisbn){
		titulo=valortitulo;
		autor=valorautor;
		anyo=valoranyo;
		editorial=valoreditorial;
		isbn=valorisbn;
	}
	
	//metodos
	
	
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String valortitulo){
		titulo=valortitulo;
	}
	public String getAutor(){
		return autor;
	}
	public void setAutor(String valorautor){
		autor=valorautor;
	}
	public int getAnyo(){
		return anyo;
	}
	public void setAnyo(int valoranyo){
		anyo=valoranyo;
	}
	public String getEditorial(){
		return editorial;
	}
	public void setEditorial(String valoreditorial){
		editorial=valoreditorial;
	}
	public String getIsbn(){
		return isbn;
	}
	public String toString(){
		String lista=titulo+"\n "+autor+"\n "+Long.toString(anyo)+"\n "+editorial+"\n "+isbn+"\n";
		return lista;
	}
	
}
