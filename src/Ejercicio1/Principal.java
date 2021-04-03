package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado.devuelveProximoID(); 
		
		Empleado juan = new Empleado("Juan",24);
		System.out.println(juan.toString());
		
		Empleado anonimo = new Empleado();
		System.out.println(anonimo.toString());
		
		Empleado.devuelveProximoID();
		
		Empleado nestor = new Empleado("Nestor",50);
		System.out.println(nestor.toString());
		
		Empleado pepa = new Empleado("Pepa",74);
		System.out.println(pepa.toString());
		
		Empleado anonimo2 = new Empleado();
		System.out.println(anonimo2.toString());
		
		Empleado.devuelveProximoID(); 


}
	
}
