package listas;

public class Persona {
	
	String nombre;
	Persona siguiente;
	
	
	public Persona(){
		this.nombre ="";
		this.siguiente = null;
		
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
		this.siguiente = null;
		
	}

}
