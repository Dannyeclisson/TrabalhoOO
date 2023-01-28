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
		JMenuBar barraDeOpcoes = new JMenuBar();
		
		//barra de opçoes
		pagina.setJMenuBar(barraDeOpcoes);
		JMenu clienteMenu = new JMenu ("Cliente");
		JMenu empresaMenu = new JMenu ("Empresa");
		JMenu orcamentoMenu = new JMenu ("Orçamentos");
		
		//criando itens para a os JMenus da barra de opçoes
		JMenuItem addCliente = new JMenuItem ("Adcionar Cliente");
		JMenuItem edtCliente = new JMenuItem ("Editar Cliente");
		JMenuItem viewCliente = new JMenuItem ("Ver Clientes");
		
		JMenuItem addEmpresa = new JMenuItem ("Adcionar Empresa");
		JMenuItem edtEmpresa = new JMenuItem ("Editar Empresa");
		JMenuItem viewEmpresa = new JMenuItem ("Ver Empresas");
		
		JMenuItem addOrcamento = new JMenuItem ("Fazer Orçamento");
		JMenuItem viewOrcamento = new JMenuItem ("Recibos");
		
		
		// Adcionando os menus e itens na barra de opçoes 
		barraDeOpcoes.add(clienteMenu);
		barraDeOpcoes.add(empresaMenu);
		barraDeOpcoes.add(orcamentoMenu);
		
		clienteMenu.add(addCliente);
		clienteMenu.add(edtCliente);
		clienteMenu.add(viewCliente);
		
		empresaMenu.add(addEmpresa);
		empresaMenu.add(edtEmpresa);
		empresaMenu.add(viewEmpresa);
		
		orcamentoMenu.add(addOrcamento);
		orcamentoMenu.add(viewOrcamento);
		
		//opçoes

		//JLabel labelclientes = new JLabel("Clientes");
		
		
		pagina.setSize(640, 480);
		
		/*
		buttonCliente.setBounds(130,100,100,40);
		
		
		pagina.getContentPane().add(labelHome);
		pagina.getContentPane().add(buttonCliente);
		pagina.getContentPane().add(buttonEmpresa);
		pagina.getContentPane().add(buttonOrcamentos);
		pagina.getContentPane().add(labelclientes);
		*/
		
		pagina.pack();
		
		pagina.setSize(600, 500);
		pagina.setLayout(null);
		
		pagina.setVisible(true);
		
	 
		
}
}
