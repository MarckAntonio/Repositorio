package Torres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class puntajes {

	puntajes(){
		final JFrame prin = new JFrame("Puntajes De Juegos");
		prin.setSize(400, 400);
		prin.setLocationRelativeTo(null);
		//prin.setResizable(false);
		prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prin.setLayout(null);
		prin.setVisible(true);
		
		
		
		
		
		
		JButton regreso = new JButton ("Regresar");
		regreso.setBounds(200, 30, 100, 30);
		prin.add(regreso);
		
		regreso.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	prin.dispose();
	        	System.out.println("regresando de juego a ventana");
	        	ventana venjuego = new ventana();
	        	
	        }
	    });
		
	}
	
}
