package listas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.LayoutQueue;

public class windows extends JFrame {

	JTextField t = new JTextField();
	JButton b = new JButton("Enter");
	Lista l = new Lista();
	objeto lp = new objeto();
	
	public windows(){
		
		
		setResizable(false);
		setLayout(null);
		
		this.setTitle("Tarea");
		this.setBounds(400, 100, 200, 150);
		this.setLayout(null);
		this.setBackground(Color.blue);
		
		t.setBounds(40,10,80,30);
		
		b.setBounds(40,80,80,30);
		
		
		
		b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lp.Insertar(t.getText());
                lp.mostrar();
                
            }
        });
		
		this.add(t);
		this.add(b);
	}
	
}
