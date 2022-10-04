package alquiler;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;



public class formulario extends JFrame implements ActionListener, ChangeListener {
	
	
	private JTextField textfield1,textfield2;

	private JLabel seleccione1,seleccione2;
	private JButton boton7,boton8;
	private JRadioButton boton1,boton2, boton3,boton4,boton5,boton6;
	  private ButtonGroup bg,bg2;
	  private JLabel label1;
		private double precio,apagar;
	   private String tipo ,habitaciones;
	   
	   
	   
	   

	public formulario() {
		setLayout(null);
		setTitle("Alquiler de Viviendas");

		bg=new ButtonGroup();
		
		
		seleccione1= new JLabel ("Seleccione el tipo de vivienda");
		seleccione1.setBounds (80,10,200,30);
		add(seleccione1);
		bg2=new ButtonGroup();
	
		boton1=new JRadioButton ("CASA");
		boton1.setBounds (20,50,90,30);
		add(boton1);
		boton1.addChangeListener(this);
		bg.add(boton1);
		boton2=new JRadioButton("DUPLEX");
		boton2.setBounds(120,50,90,30);
		add(boton2);
		boton2.addChangeListener(this);
		bg.add(boton2);
		boton3=new JRadioButton("DEPARTAMENTO");
		boton3.setBounds(220,50,90,30);
		add(boton3);
		boton3.addChangeListener(this);
		
		bg.add(boton3);
		
		boton4=new JRadioButton ("UN DORMITORIO");
		boton4.setBounds (10,150,150,30);
		add(boton4);
		boton4.addChangeListener(this);
		bg2.add(boton4);
		boton5=new JRadioButton ("DOS DORMITORIOS");
		boton5.setBounds (10,180,150,30);
		add(boton5);
		boton5.addChangeListener(this);
		bg2.add(boton5);
		
		
		boton6=new JRadioButton ("TRES DORMITORIOS");
		boton6.setBounds (10,210,150,30);
		add(boton6);
		boton6.addChangeListener(this);
		bg2.add(boton6);
		
		label1=new JLabel("cantidad de Noches");
		label1.setBounds(10,240,150,30);
		add(label1);
		textfield1=new JTextField("");
		textfield1.setBounds(10,270,90,30);
		add(textfield1);
		
	    textfield2 = new JTextField("$0,00");
		textfield2.setBounds(10,370,120,50);
		textfield2.setFont(new Font("arial",2,30));
		add(textfield2);
		
	
		boton7=new JButton("CALCULAR IMPORTE");
		boton7.setBounds(200,220,200,30);
		add(boton7);
	    boton7.addActionListener(this);
		add(boton7);
		
		boton8=new JButton("Mostrar dialogo");
		boton8.setBounds(200,180,200,30);
		add(boton8);
		boton8.addActionListener(this);
		add(boton8);
		
	
	}
	
	

	
	public void stateChanged(ChangeEvent e)   {
		
	
		if (boton1.isSelected()&&boton4.isSelected()) {
			precio=50+(50*20)/100;
			tipo = "casa";
			 habitaciones="Dos dormitorio";
			}
		
		
		if (boton1.isSelected()&& boton5.isSelected()) {
			precio=50+(50*25)/100;
			
			  tipo="Casa";
			   habitaciones="Dos dormitorio";
			}
		
		if (boton1.isSelected()&& boton6.isSelected()) {
			precio=50+(50*30)/100;
			  tipo="Casa";
			   habitaciones="Tres dormitorio";
			
			}
		
		
		if (boton2.isSelected()&& boton4.isSelected()) {
			precio=50+(40*20)/100;
			
			
			  tipo="duplex";
			   habitaciones="Un dormitorio";
			}
		
		if (boton2.isSelected()&& boton5.isSelected()) {
			precio=40+(40*25)/100;
			
			  tipo="duplex";
			   habitaciones="Dos dormitorios";
			}
		
		if (boton2.isSelected()&& boton6.isSelected()) {
			precio=40+(40*30)/100;
			  tipo="Casa";
			   habitaciones="Tres dormitorios";
			
			}
		
		
		
		if (boton3.isSelected()&& boton4.isSelected()) {
			precio=30+(30*20)/100;
			
			
			  tipo="Departamento";
			   habitaciones="Un dormitorio";
			}
			
		
		if (boton3.isSelected()&& boton5.isSelected()) {
			precio=30+(30*25)/100;
			
			
			  tipo="Departamento";
			   habitaciones="Dos dormitorios";
			}
			
		if (boton3.isSelected()&& boton6.isSelected()) {
			precio=30+(30*30)/100;
			
			  tipo="Departamento";
			   habitaciones="Tres dormitorio";
			}
	}
	
	public void actionPerformed(ActionEvent e) {
		
	
		if (e.getSource()==boton7) {
			int dias = Integer.parseInt(textfield1.getText());
			precio=precio*dias;
			textfield2.setText("$" + String.valueOf(precio));
			textfield2.setFont(new Font("cooper",2,20));

				}
		
			

			if (e.getSource()==boton8) {
				

		dialogo de=new dialogo(tipo,habitaciones);
				de.setBounds(10,10,300,300);
				de.setVisible(true);
				
				
				
			
				}
			
			
			
			
			
			
			
			}
		
			
	
	public static void main (String[] ar){
		
		
		formulario f=new formulario ();
		f.setTitle("ALQUILER");
		f.setBounds (0,0,500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
