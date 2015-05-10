package Torres;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class demo extends JPanel {
	private ImageIcon ff = new ImageIcon("Imagenes\\palos.png");
	
	//private static Object venjuego;

	public demo(){
		int contador=0;
		
		final JFrame ven = new JFrame("Demo de Juego");
		ven.setSize(800, 400);
		ven.setVisible(true);
		ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ven.setLocationRelativeTo(null);
		ven.setResizable(false);
		ven.setLayout(null);
	
		
		//Agregando Botones
		JButton disco1 = new JButton("1");
		disco1.setBounds(113,125, 50, 20);
		
		JButton disco2 = new JButton("2");
		disco2.setBounds(100,150, 75, 20);
		
		JButton disco3 = new JButton("3");
		disco3.setBounds(88,175, 100, 20);
		
		JButton disco4 = new JButton("4");
		disco4.setBounds(75,200, 120, 20);
		
		JButton disco5 = new JButton("5");
		disco5.setBounds(63,225, 150, 20);
		
		JButton disco6 = new JButton("6");
		disco6.setBounds(50,250, 175, 20);
		
		JButton disco7 = new JButton("7");
		disco7.setBounds(38,275, 200, 20);
		
		JButton disco8 = new JButton("8");
		disco8.setBounds(25,300, 225, 20);
		//agregaando objetos
		ven.add(disco1);
		ven.add(disco2);
		ven.add(disco3);
		ven.add(disco4);
		ven.add(disco5);
		
		//palos
		JLabel palo1 = new JLabel(ff);
		palo1.setBounds(125,100, 10, 225);
		palo1.setVisible(true);
		ven.add(palo1);
				
		JLabel palo2 = new JLabel(ff);
		palo2.setBounds(375,100, 10, 225);
		palo2.setVisible(true);
		ven.add(palo2);		
		
		JLabel palo3 = new JLabel(ff);
		palo3.setBounds(625,100, 10, 225);
		palo3.setVisible(true);
		ven.add(palo3);
		
		//ven.add(disco6);
		//ven.add(disco7);
		//ven.add(disco8);

		
		
		
		
		
		
//*****************************************************************
		JButton regreso = new JButton ("Regresar");
		regreso.setBounds(350, 30, 100, 30);
		ven.add(regreso);
		
		regreso.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	ven.dispose();
	        	System.out.println("regresando de juego a ventana");
	        	ventana venjuego = new ventana();
	        	
	        }
	    });
			
		
	}//fin del contructor
	
			public void demostracion(){
			boolean bandera = true;
				//*******************************************************************		
				
				while (bandera) {
					
					
					System.out.println("probando hilos");
					
					try {
						//disco1.setBounds(113,125, 50, 20);
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				
				
		//*******************************************************************	
				/*
				int x = getWidth()/2
				
				public void paint(Graphics g){
					g.setColor(getBackground());
					g.fillRect(0, 0, getWidth(), getHeight());
					g.setColor(Color.red);
					
				}
				*/
				
			
		}

	
}
