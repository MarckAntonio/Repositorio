package listas;

public class objeto {
	
	Persona inicio;
	
	public objeto(){
		inicio = null;
	}
	
	public void Insertar(String nombre){
		Persona nuevo = new Persona(nombre);
		if(inicio==null){
			inicio = nuevo;
		}else{
			Persona aux = inicio;
			while(aux!=null){
				
				if(aux.siguiente == null){
					aux.siguiente = nuevo;
					break;
				}
				
				aux = aux.siguiente;
					
			}
		}
		
		
	}
	
	
	public void mostrar(){
		
		if(inicio!=null){
			Persona aux = inicio;
			while(aux!=null){
				System.out.println(aux.nombre+"**");
				aux = aux.siguiente;
			}
			
		}
		
	}
	
	

}
