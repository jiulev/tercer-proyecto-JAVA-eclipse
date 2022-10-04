package alquiler;

import javax.swing.*;
import java.awt.event.*;
class dialogo extends JDialog implements ActionListener
{
	private JLabel label1,label2;
	private JButton boton8,boton9;

	public dialogo (String tipo2, String habitaciones2) {
		
		setLayout(null);
		setResizable(false);
		setModal(true);
		label1=new JLabel("TIPO DE VIVIENDA: "+tipo2);
		label1.setBounds(10,10,300,20);
		add(label1);
		label2=new JLabel("CANTIDAD DE DORMITORIOS: "+habitaciones2);
		label2.setBounds(10,50,300,20);
		add(label2);
		boton9=new JButton("Ok");
		boton9.setBounds(10,100,100,30);
		boton9.addActionListener(this);

		add(boton9);
		}
	public void
	
	
	actionPerformed(ActionEvent e)
	{
	if (e.getSource()==boton9)dispose();
	}
	

	
	
	
	

}
