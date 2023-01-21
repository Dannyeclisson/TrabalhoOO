package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public abstract class TelaPrincipal extends JFrame{

		
	public static void  main(String[] args) {
		
		JFrame pagina = new JFrame("Pagina Inicial");
		final JLabel labelHome = new JLabel("xablau");
		JButton buttonCliente = new  JButton("Clientes");
		JButton buttonEmpresa = new JButton("Epresas");
		JButton buttonOrcamentos = new JButton("Orçamentos");
		
		
		
		TelaPrincipal.setDefaulCloseOperantion(JFrame.DISPOSE_ON_CLOSE);
		pagina.setSize(640, 480);
		buttonCliente.setBounds(130,100,100,40);
	
		pagina.getContentPane().add(labelHome);
		pagina.getContentPane().add(buttonCliente);
		pagina.getContentPane().add(buttonEmpresa);
		pagina.getContentPane().add(buttonOrcamentos);
		
		pagina.pack();
		
		pagina.setSize(600, 500);
		pagina.setLayout(null);
		
		pagina.setVisible(true);
		
	 
		
}
}
