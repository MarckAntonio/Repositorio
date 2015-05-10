package Torres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;

public class ventana {
	private ImageIcon ff = new ImageIcon("Imagenes\\10.png");
	
	public static int cantidadDiscos=0;
	
	public static void main (String [] args){
        /*
		Esta parte es para look and feel por lo tanto es opcional, solo hay que descomentarla
        try{
            UIManager.setLookAndFeel( new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel() );
        }catch( Exception e ){}
		*/
		ventana principal = new ventana();
		
	}
	
	
	
	ventana (){
		final JFrame prin = new JFrame("Juego Torres de Hanoi");
		prin.setSize(400, 400);
		prin.setVisible(true);
		prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prin.setLocationRelativeTo(null);
		prin.setResizable(false);
		prin.setLayout(null);
	
		
		//Label
		JLabel titulo = new JLabel ("Torres de Hanoi");
		//titulo.setText("Torres de Hanoi");
		titulo.setBounds(140, 50, 130, 30);
		titulo.setForeground(Color.white);
		
		JLabel titulodisco = new JLabel ("Número de Discos");
		titulodisco.setBounds(275,50,120,30);
		titulodisco.setForeground(Color.WHITE);
		
		//botones
		JButton bJuego = new JButton("Jugar");
		bJuego.setBounds(120, 100, 130, 30);
		
		JButton bDemo = new JButton("Demo");
		bDemo.setBounds(120, 150, 130, 30);
		
		JButton bIntrucciones = new JButton("Instrucciones");
		bIntrucciones.setBounds(120, 200, 130, 30);
		
		JButton bPuntajes = new JButton("Puntajes");
		bPuntajes.setBounds(120, 250, 130, 30);
		
		JButton bSalir = new JButton("Salir");
		bSalir.setBounds(120, 300, 130, 30);
		
		//Textfield
		final JTextField nodisco = new JTextField();
		nodisco.setBounds(300, 75, 20, 20);
		nodisco.setText("3");

		
	
		
		//agregando objetos
		//botones
		prin.add(bJuego);
		prin.add(bDemo);
		prin.add(bIntrucciones);
		prin.add(bPuntajes);
		prin.add(bSalir);
		//JLabels
		prin.add(titulo);
		prin.add(titulodisco);
		//texfield
		prin.add(nodisco);
		//fondo
		
		//fondo
		JLabel fondo = new JLabel(ff);
		fondo.setSize(400, 400);
		fondo.setVisible(true);
		prin.add(fondo);
		
	/*
				//ccantidad de discos
		String[] cantidad = new String[] {"3","4","5","6","7","8"};
        final JComboBox combo = new JComboBox(cantidad);
        combo.setBounds(300,100,50,20);
        //combo.setVisible(true);
		prin.add(combo);
*/
		
		//mostrando todo
		//paintComponents (getGraphics());//para que se dibujen todos los objetos
		
		//Eventos de botones
		//bJuego
		bJuego.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	cantidadDiscos= Integer.parseInt(nodisco.getText());
            	System.out.println("que onda canal nuevo juego");
            	
            	//
            	juego venjuego = new juego(cantidadDiscos);
           
            	//prin.dispose();  
            	prin.setVisible(false);
            	//llamarNuevo(discos.getSelectedItem());
            }
        });
		
		//bDemo
		bDemo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	prin.dispose();
            	System.out.println("soy el demo carnal");
            	demo venjuego = new demo();
            	//llamarDemo();
            }
        });
		
		//bIntrucciones
		bIntrucciones.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	prin.dispose();
            	System.out.println("soy el instrucciones carnal");
            	instrucciones veninstrucciones = new instrucciones();
            	//llamarDemo();
            }
        });
		
		//bPuntajes
		bPuntajes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	prin.dispose();
            	System.out.println("soy puntajes carnal");
            	puntajes venpuntajes = new puntajes();
            	//llamarDemo();
            }
        });
		
		//bsalir
		bSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	prin.dispose();
            	System.out.println("Adios Carnal");
            	System.exit(0);
            	//llamarDemo();
            }
        });
		
	}//fin contrucctor
	
	
	

}
