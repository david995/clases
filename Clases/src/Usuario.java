public class Usuario {

	private String nombre;
	private String dni;
	private String direccion;
	private int num_prestamos;
	private Prestamo[] prestamos;

	public Usuario(String nombre_, String dni_, String direccion_) {
		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;
		num_prestamos = 0;
	}

	public Usuario(String nombre_, String dni_, String direccion_,Prestamo[] prestamos_) {

		nombre = nombre_;
		dni = dni_;
		direccion = direccion_;
		prestamos = prestamos_;
		for (int i = 0; i < prestamos_.length; i++) {
			if (prestamos[i] != null) {
				num_prestamos++;
			}
		}

	}// constructor

	public Prestamo[] getPrestamosActivos() {
		Prestamo[] prestamosActivos = new Prestamo[10];
		int j = 0;
		for (int i = 0; i < prestamos.length; i++) {
			if (prestamos[i] != null
					&& prestamos[i].getEstado().equals("activo")) {

				prestamosActivos[j] = prestamos[i];
				j++;
			}
		}
		return prestamosActivos;
	}

	Prestamo[] getPrestamosSancionados() {
		int j = 0;
		Prestamo[] prestamosSancionados = new Prestamo[10];
		for (int i = 0; i < prestamos.length; i++) {
			if (prestamos[i] != null && prestamos[i].getSancion() == true) {
				prestamosSancionados[j] = prestamos[i];
				j++;
			}
		}
		return prestamosSancionados;
	}

	void addPrestamo(Prestamo prestamo_) {
		boolean insertado = false;
		for (int i = 0; i < prestamos.length && insertado == true; i++) {
			if (existePrestamo(Integer.parseInt(prestamos[i].getId())) == true) {
				System.out.println("Ya existe este préstamo");
			} else {
				if (prestamos[i] == null) {
					prestamos[i] = prestamo_;
					insertado=true;
					System.out.println("Préstamo guardado");
				}// if
			}// else
		}// for

	}

	boolean existePrestamo(int id_prestamo) {
		boolean existe = false;
		for (int i = 0; i < prestamos.length; i++) {
			if (prestamos[i] != null && existe == false) {
				if (Integer.parseInt(prestamos[i].getId()) == id_prestamo)
					existe = true;
			}
		}
		return existe;
	}

	void cancelarPrestamo(int id_prestamo) {
		boolean borrado=false;
		for (int i = 0; i < prestamos.length && borrado==true; i++) {
			if (existePrestamo(id_prestamo) != false) {
				prestamos[i] = null;
				borrado=true;
				System.out.println("Préstamo borrado");
			} else {
				System.out.println("Préstamo no borrado");
			}// if
		}// else
	}// for
	
	public int getdni(){
		return Integer.parseInt(dni);
	}

	public String toString() {
		String cadena = nombre + " " + dni + " " + direccion + " "+ String.valueOf(num_prestamos) + " " + prestamos;
		return cadena;

	}
}
