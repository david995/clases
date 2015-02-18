import java.util.*;
import java.io.*;

public class Biblioteca {

	private Usuario[] usuarios;
	private Libro[] libros;
	private  Prestamo[] prestamos;
	
	public Biblioteca() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("biblioteca.txt"));
		
		String cadenaString;
		int numero=0;
		int numprestamo;
		 String titulo;
		String autor;
		 int anyo;
		String editorial;
		 String isbn;
		int i=0;
		
			in.next();
			numero=in.nextInt();
			numprestamo=numero;
			in.next();
			numero=in.nextInt();
			libros = new Libro[numero]; 
			in.next();
			numero=in.nextInt();
			usuarios = new Usuario[numero]; 
			
			
			in.nextLine();
			in.nextLine();
	
			in.useDelimiter(";"); 
		
		
			titulo=in.next();
		while(titulo.contains("Prestamos")==false){
			
			autor=in.next();
			anyo=in.nextInt();
			editorial=in.next();
			isbn=in.next();
			Libro l1 = new Libro(titulo,autor,anyo,editorial,isbn);
			libros[i]=l1;
			i++;
			titulo=in.next();
		}
		
		in.nextLine();
		
		while(in.hasNext()){
			String lineausuario = in.nextLine();
			Scanner inusuario = new Scanner(lineausuario);
			inusuario.useDelimiter(";");
			int e=0;
			 String nombre=inusuario.next();
			 String dni=inusuario.next();
			 String direccion=inusuario.next();
			 int num_prestamos=inusuario.nextInt();
			 prestamos = new Prestamo[num_prestamos];
			 
			 	int idprestamos;
				int id;
				Libro libro=libros[i];
				String titlibro;
				String fecha_inicio;
				String fecha_fin;
				boolean sanction;
				String estado;
			 
			for (int j = 0; j < num_prestamos; j++) {
				
				id=inusuario.nextInt();
				titlibro=inusuario.next();
				for (int c = 0; c < libros.length; c++) {
					if(libros[c].getTitulo().equals(titlibro)){
						libro=libros[c];
					}
				}
				fecha_inicio=inusuario.next();
				fecha_fin=inusuario.next();
				sanction=inusuario.nextBoolean();
				estado=inusuario.next();
				Prestamo p1 = new Prestamo(id,libro,fecha_inicio,fecha_fin,sanction,estado);
				prestamos[j]=p1;
			}
			
			Usuario u1 = new Usuario(nombre,dni,direccion,prestamos);
			 usuarios[e]=u1;
			 e++;
			 
		}
	}//bibliotetca
	
	//metodos
	
	public void altaUsuario(Usuario usuario_){
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null){
			usuarios[i] = usuario_;	
			}
		}
		
	}
	public void bajaUsuario(int dni_){
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i].getdni()==dni_){
			usuarios[i] = null;	
			}
		}
	}
	public void altaLibro(Libro libro_){
		for (int i = 0; i < libros.length; i++) {
			if(libros[i]!=null){
			libros[i] = libro_;	
			}
		}
	}
	public void getNumPrestamosActivos(){
		
	}
	public void getNumPrestamosSanciones(){
		
	}
	public String histograma(){
	
		String cadena="";
		
		for (int i = 0; i < 10; i++) {
			cadena=cadena+"usuarios con "+i+" prestamos: ";
			for (int j = 0; j < usuarios.length ; j++) {
				cadena=cadena+"*";
			}
			cadena=cadena+"\n";
		}
		return cadena;
	}
	public void guardar() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("biblio.txt");
		out.println("last_id_prestamos 0");
		out.println("Num_max_libros 50");
		out.println("Num_max_usuarios 50");
		out.println("Libros:");
		out.println("----------------");
		for (int i = 0; i < libros.length; i++) {
			out.println(libros[i]);
		}
		out.println("Prestamos:");
		out.println("-------------;");
		for (int l = 0; l < usuarios.length; l++) {
			out.println(usuarios[l]);
			for (int j = 0; j < prestamos.length; j++) {
				out.println(prestamos[j]);
			}
		}
		out.close();
		System.out.println("Se ha escrito en el fichero");
	}
}
