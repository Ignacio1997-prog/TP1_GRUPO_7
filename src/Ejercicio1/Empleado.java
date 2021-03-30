package Ejercicio1;

public class Empleado {
	
	private final int id;
	private static final int idMil = 1000;
	private String nombre;
	private int edad;
	private static int cont = 0;
	
	
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
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Empleado.cont = cont;
	}

	}
