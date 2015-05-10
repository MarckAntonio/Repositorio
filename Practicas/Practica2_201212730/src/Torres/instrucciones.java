package Torres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class instrucciones {

	private ImageIcon instru = new ImageIcon("Imagenes\\instru.png");
	
	instrucciones (){
		final JFrame prin = new JFrame("Instrucciones Del Juego");
		prin.setSize(400, 450);
		prin.setLocationRelativeTo(null);
		//prin.setResizable(false);
		prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prin.setLayout(null);
		prin.setVisible(true);
		
		//botones
		//regresar
		JButton regresar = new JButton("regresar");
		regresar.setBounds(200,25,150,20);
		
		//label

		
		
		//agregando componentes
		prin.add(regresar);
		
		
		//fondo
		JLabel fondoi = new JLabel(instru);
		fondoi.setBounds(1,1,400,400);
		fondoi.setVisible(true);
		prin.add(fondoi);
		
		
		
		//eventos
		regresar.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	prin.dispose();
	        	System.out.println("regresando de instrucciones a ventana");
	        	ventana venjuego = new ventana();
	        	
	        }
	    });
		
		
	}//fin contrucctor
	

	
	
}
