package Torres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;

import javax.swing.UIManager;

public class juego extends JFrame implements Runnable, ActionListener{
	
		private ImageIcon ff = new ImageIcon("Imagenes\\palos.png");
		private ImageIcon blanco = new ImageIcon("Imagenes\\blanco.png");
		public static int onoff = 0;
		public static int discos =0;
	
	public juego(int a){

		
		//creando ventana
		final JFrame venjuego = new JFrame("Juego Torres de Hanoi");
		venjuego.setSize(800, 400);
		venjuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venjuego.setLocationRelativeTo(null);
		//venjuego.setResizable(false);
		venjuego.setLayout(null);
		venjuego.setVisible(true);
		//fondo
		/*
		JLabel myfondo = new JLabel(blanco);
		myfondo.setSize(800, 400);
		//myfondo.setBounds(125,100, 10, 225);
		myfondo.setVisible(true);
		venjuego.add(myfondo);
		*/
		
		 discos = a; 
		//discos = a;
		//discos = ventana.cantidadDiscos;
		 //boton regreso
		JButton regreso = new JButton ("Regresar");
		regreso.setBounds(350, 30, 100, 30);
		venjuego.add(regreso);
		
		regreso.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	venjuego.dispose();
	        	System.out.println("regresando de juego a ventana");
	        	ventana venjuego = new ventana();
	        	
	        }
	    });
		
		
		if (discos == 3){
			//Agregando Botones
			JButton disco1 = new JButton("1");
			disco1.setBounds(113,125, 50, 20);
			
			JButton disco2 = new JButton("2");
			disco2.setBounds(100,150, 75, 20);
			
			JButton disco3 = new JButton("3");
			disco3.setBounds(88,175, 100, 20);
			
			JButton disco8 = new JButton("8");
			disco8.setBounds(25,300, 225, 20);
			
			//agregaando objetos
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco8);
			
			//botones torre 2
			JButton t2disco8 = new JButton("8");
			t2disco8.setBounds(275,300, 225, 20);
			
			//agregando objetos torre2
			venjuego.add(t2disco8);
			
			//botones torre 3
			JButton t3disco8 = new JButton("8");
			t3disco8.setBounds(525,300, 225, 20);
			
			//agregando objetos torre3
			venjuego.add(t3disco8);

		}
		
		if (discos == 4){
			//Agregando Botones
			JButton disco1 = new JButton("1");
			disco1.setBounds(113,125, 50, 20);
			
			JButton disco2 = new JButton("2");
			disco2.setBounds(100,150, 75, 20);
			
			JButton disco3 = new JButton("3");
			disco3.setBounds(88,175, 100, 20);
			
			JButton disco4 = new JButton("4");
			disco4.setBounds(75,200, 120, 20);
			
			//agregaando objetos
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco4);
		}
		
		if (discos == 5){
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
			
			//agregaando objetos
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco4);
			venjuego.add(disco5);
		}
		
		if (discos == 6){
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

			//agregaando objetos
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco4);
			venjuego.add(disco5);
			venjuego.add(disco6);

		}
		
		if (discos == 7){
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
			
			//agregaando objetos
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco4);
			venjuego.add(disco5);
			venjuego.add(disco6);

		}
		
		if (discos == 8){
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
			venjuego.add(disco1);
			venjuego.add(disco2);
			venjuego.add(disco3);
			venjuego.add(disco4);
			venjuego.add(disco5);
			venjuego.add(disco6);
			venjuego.add(disco7);
			venjuego.add(disco8);
		}
		
		
		//palos
		JLabel palo1 = new JLabel(ff);
		palo1.setBounds(125,100, 10, 225);
		palo1.setVisible(true);
		venjuego.add(palo1);
				
		JLabel palo2 = new JLabel(ff);
		palo2.setBounds(375,100, 10, 225);
		palo2.setVisible(true);
		venjuego.add(palo2);		
		
		JLabel palo3 = new JLabel(ff);
		palo3.setBounds(625,100, 10, 225);
		palo3.setVisible(true);
		venjuego.add(palo3);
		
		
		//eventos
		//Empezar
		/*
				empezar.addActionListener(new ActionListener(){
		            public void actionPerformed(ActionEvent e){
		            	//prin.dispose();
		            	System.out.println("soy el demo carnal");
		            	//Cronometro.cronometroActivo = true;
		            	Cronometro venjuego = new Cronometro();
		            	venjuego.iniciarCronometro();
		            	//llamarDemo();
		            }
		        });
		
				*/
		/*************************************************************************
		 * 
		 *///
				
		        //Etiqueta donde se colocara el tiempo 
		        tiempo = new JLabel( "00:00:000" );
		        tiempo.setFont( new Font( Font.SERIF, Font.BOLD, 50 ) );
		        tiempo.setHorizontalAlignment( JLabel.CENTER );
		        tiempo.setForeground( Color.white );
		        tiempo.setBackground( Color.black );
		        tiempo.setOpaque( true );
		        tiempo.setBounds(500,10,275,50);

		        venjuego.add(tiempo);
		        //add( tiempo, BorderLayout.CENTER );

		        //Boton iniciar
		        JButton btn = new JButton( "Iniciar" );
		        btn.addActionListener( this );
		        btn.setBounds(25,30,100,30);
		        venjuego.add(btn);
		        //add( btn, BorderLayout.NORTH );

		        //Boton reiniciar inicia nuevamente desde 0
		        JButton btnP = new JButton( "Reiniciar" );
		        btnP.addActionListener( this );
		        btnP.setBounds(150, 30, 100, 30);
		        venjuego.add(btnP);
		       // add( btnP, BorderLayout.SOUTH );

		        //boton para
		        JButton stopp = new JButton( "Parar" );
		        stopp.addActionListener( this );
		        stopp.setBounds(120, 325, 130, 30);
		        venjuego.add(stopp);
		        //add( stopp, BorderLayout.EAST);
		        
		       // this.setLocationRelativeTo( null );
		        //setVisible( true );
		        
		        
		        
		        
		        paintComponents (getGraphics());//para que se dibujen todos los objetos
		        
		    }

		    public void run(){
		        Integer minutos = 0 , segundos = 0, milesimas = 0;
		        //min es minutos, seg es segundos y mil es milesimas de segundo
		        String min="", seg="", mil="";
		        try
		        {
		            //Mientras cronometroActivo sea verdadero entonces seguira
		            //aumentando el tiempo
		            while( cronometroActivo )
		            {
		                Thread.sleep( 4 );
		                //Incrementamos 4 milesimas de segundo
		                milesimas += 4;

		                //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
		                //y las milesimas de segundo de nuevo a 0
		                if( milesimas == 1000 )
		                {
		                    milesimas = 0;
		                    segundos += 1;
		                    //Si los segundos llegan a 60 entonces aumenta 1 los minutos
		                    //y los segundos vuelven a 0
		                    if( segundos == 60 )
		                    {
		                        segundos = 0;
		                        minutos++;
		                    }
		                }

		                //Esto solamente es estetica para que siempre este en formato
		                //00:00:000
		                if( minutos < 10 ) min = "0" + minutos;
		                else min = minutos.toString();
		                if( segundos < 10 ) seg = "0" + segundos;
		                else seg = segundos.toString();

		                if( milesimas < 10 ) mil = "00" + milesimas;
		                else if( milesimas < 100 ) mil = "0" + milesimas;
		                else mil = milesimas.toString();

		                //Colocamos en la etiqueta la informacion
		                tiempo.setText( min + ":" + seg + ":" + mil );
		            }
		        }catch(Exception e){}
		        //Cuando se reincie se coloca nuevamente en 00:00:000
		        tiempo.setText( "00:00:000" );
		    }

		    //Esto es para el boton iniciar y reiniciar
		    public void actionPerformed( ActionEvent evt ) {
		        Object o = evt.getSource();
		        if( o instanceof JButton )
		        {
		            JButton btn = (JButton)o;
		            if( btn.getText().equals("Iniciar") ){
		                if(onoff == 0){
		                   onoff = 1;
		                   iniciarCronometro();
		                }
		            }
		            //
		            if( btn.getText().equals("Parar") ) {
		            	pausarCronometro();
		                /*if (onoff == 1){
		                   onoff = 0;
		                   pararCronometro();
		                }*/
		            }
		            //
		            
		            if( btn.getText().equals("Reiniciar") ) {
		                if (onoff == 1){
		                   onoff = 0;
		                   pararCronometro();
		                }
		            }
		        }
		    }

		    //Iniciar el cronometro poniendo cronometroActivo 
		    //en verdadero para que entre en el while
		    public void iniciarCronometro() {
		        cronometroActivo = true;
		        hilo = new Thread( this );
		        hilo.start();
		        jugar(discos);
		    }

		    //Esto es para parar el cronometro
		    public void pararCronometro(){
		        cronometroActivo = false;
		    }
		    
		    public void pausarCronometro(){
		        cronometroActivo = false;
		        try {
		        	
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		        
		        //paintComponents (getGraphics());//para que se dibujen todos los objetos
		        
		    }
/*
		    public static void main(String[] args) {
		        //Esta parte es para look and feel por lo tanto es opcional, solo hay que descomentarla
		        //try{
		        //    UIManager.setLookAndFeel( new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel() );
		        //}catch( Exception e ){}
		        new Crono();
		    }
*/
		    JLabel tiempo;
		    Thread hilo;
		    boolean cronometroActivo;
	//}
	

	
	
	
	//public void dibuja(Graphics g) {
   // g.setColor(Color.red);
	//g.fillRect(50, 150, 50, 60);

		//}
	
	public Stack <Integer> torre1 = new Stack<Integer>();
	public Stack <Integer> torre2 = new Stack<Integer>();
	public Stack <Integer> torre3 = new Stack<Integer>();
	
	
	public void jugar(int nodiscos){
		int discost = nodiscos;
		System.out.println("me llamaste carnal");
	}
	
	
	
}
