package listas;

public class Nodo {

	String Nombre;
	Nodo siguiente;
	
	public Nodo(){
		this.Nombre = "";
		this.siguiente = null;
	}
	
	public Nodo(String s){
		this.Nombre = s;
		this.siguiente = null;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
}
