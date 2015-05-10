package clase;

public class cola {

	public static void main(String [] args) {
		// TODO Auto-generated method stub

	       cola cola=new cola();
			

			cola.offer("uno");
			cola.offer("dos");
			cola.offer("tres");
			cola.offer("cuatro");
			cola.offer("cinco");

			System.out.println("Primer valor Cola"); 
			System.out.println(cola.peek()); 

			System.out.println(" "); 
			System.out.println(" "); 

			System.out.println("Datos Cola"); 

			while(cola.peek()!=null){ 
			System.out.println(cola.poll()); 
			}

		
	}

}
