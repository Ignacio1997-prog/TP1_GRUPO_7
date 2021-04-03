package Ejercicio1;

public class Empleado {
	
	private final int id;
	private static final int idMil = 1000;
	private String nombre;
	private int edad;
	private static int cont = 0;
	
	//Constructores
	public Empleado()
	{
		cont++;
		id = cont + idMil;
		this.nombre = "sin nombre";
		this.edad = 99; 
	}
	
	public Empleado(String nombre, int edad)
	{
		cont++;
		id = cont + idMil;
		this.nombre = nombre;
		this.edad  = edad;
	}

	
	//Gets Y Sets
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodo
	public static void devuelveProximoID() //Hice el metodo void para que muestre el cartel como dice la consigna (el método devolverá el siguiente cartel “El próximo ID será el 1445”)
	{
		int proxId =  idMil + cont+1;
		System.out.println("El proximo ID sera el " + proxId); 
	}

	//ToString
		@Override
		public String toString() {
			return "ID: " + id + ", Empleado: " + nombre + " Edad: " + edad;
		}
		
	}
