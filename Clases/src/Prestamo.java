import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Prestamo {
	
	//atributos
	
	private static int num_prestamos;
	private int id;
	private Libro libro;
	private String fecha_inicio;
	private String fecha_fin;
	private boolean sanction;
	private String estado;
	
	
	//constructores
	
	public Prestamo(Libro valorlibro){
		num_prestamos=num_prestamos+1;
		id=num_prestamos;
		libro = valorlibro;
				
		Calendar calendar = new GregorianCalendar();
		Date date_inicio = calendar.getTime();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		fecha_inicio = formatoFecha.format(date_inicio);
		calendar.add(Calendar.DATE, 30);
		Date date_fin = calendar.getTime();
		fecha_fin = formatoFecha.format(date_fin);
		
		sanction = false;
		estado="activo";
	}
	public Prestamo(int valorid, Libro valorlibro,String valorinicio,String valorfin, boolean valorsanction, String valorestado){
		id=valorid;
		libro=valorlibro;
		fecha_inicio=valorinicio;
		fecha_fin=valorfin;
		sanction=valorsanction;
		estado=valorestado;
	}
	
	
	//metodos
	
	public String getId (){
		return String.valueOf(id);
	}
	public Libro getLibro (){
		return libro;
	}
	public String getFechaInicio(){
		return fecha_inicio;
	}
	public String getFechaFin(){
		return fecha_fin;
	}
	public boolean getSancion(){
		if (sanction == true){
			System.out.println("+");
		}else
			System.out.println("-");
		return sanction;
	}
	public String getEstado(){
		return estado;
	}
	public String toString(){
		String lista = String.valueOf(num_prestamos)+" "+String.valueOf(id)+" "+libro.toString()+" "+fecha_inicio+" "+fecha_fin+" "+String.valueOf(sanction)+" "+estado;
		return lista;
	}
	public void ampliarPrestamo(int dias) throws ParseException{
		//pasar de string a date
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		Date date_fin =formatoFecha.parse(fecha_fin);
		//incrementar dias
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date_fin);
		calendar.add(Calendar.DATE, dias);
		//pasar de date a string
		date_fin = calendar.getTime();
		fecha_fin = formatoFecha.format(date_fin);
	}
	void setEstado(){
		estado="desactivado";
	}
	void setSancion(){
		sanction=false;
	}
}
