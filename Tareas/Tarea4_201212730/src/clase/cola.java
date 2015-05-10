package clase;

import java.util.ArrayList;

public class cola {

	//PRIMERO QUE ENTRA PRIMERO QUE SALE
	
	private ArrayList<Object> fifo= new ArrayList();
	
	public void offer(Object o){
		//AGREGAR VALORES A LA COLA
	fifo.add(o);
	
	}

	
	public Object poll(){
		//MOSTRAR EL ULTIMO VALOR Y LO ELIMINA
		 
		if(!(fifo.isEmpty())){
               Object o = fifo.get(0);
               fifo.remove(0);
               return o;
		}else{
            return null;
    }
		
	}

	public Object peek(){
		//DEVUELVE EL PRIMER VALOR DE ENTRADA

		if(!(fifo.isEmpty())){
             return fifo.get(0);
		}else{
            return null;
    }

	}


}
