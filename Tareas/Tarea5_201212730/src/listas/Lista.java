package listas;

public class Lista {

	Nodo inicio;
	
	public Lista(){
		inicio = null;
	}
	
	public void insertar(String s){
		Nodo nuevo = new Nodo(s);
		if(inicio == null){
			inicio = nuevo;
		}else{
			Nodo aux = inicio;
			while(aux!= null){
				if(aux.siguiente == null){
					aux.siguiente = nuevo;
					break;
				}else{
					aux = aux.siguiente;
				}
				
			}
			
		}
	}
	
	public void mostrar(){
		Nodo aux = inicio;
		String lista = "";
		while (aux != null){
			lista += aux.getNombre() +"**";
			aux = aux.siguiente;
		}
		lista += "null";
		System.out.println(lista);
	}
	
	
	public static void main(String[] args) {
		windows n = new windows();
		n.setVisible(true);

	}
	
	
}
