package view;
import javax.swing.*;

public class TelaCliente {
	private static JTextField txtDigiteONome;
	private static JTextField txtDigiteOCPF;
	private static JTextField txtDigiteOCpf;

	public static void main(String[] args) {
		JFrame telaCliente = new JFrame("Cliente");
		telaCliente.setBounds(100, 100, 477, 318);
		telaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCliente.getContentPane().setLayout(null);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente");
		lblNomeDoCliente.setBounds(12, 12, 112, 39);
		telaCliente.getContentPane().add(lblNomeDoCliente);
		
		txtDigiteONome = new JTextField();
		txtDigiteONome.setText("Digite o nome do Cliente");
		txtDigiteONome.setBounds(142, 52, 207, 26);
		telaCliente.getContentPane().add(txtDigiteONome);
		txtDigiteONome.setColumns(10);
		
		JLabel lblEmailDoCliente = new JLabel("Email do cliente");
		lblEmailDoCliente.setBounds(12, 56, 112, 17);
		telaCliente.getContentPane().add(lblEmailDoCliente);
		
		txtDigiteOCPF = new JTextField();
		txtDigiteOCPF.setText("Digite o e-mail do cliente");
		txtDigiteOCPF.setBounds(142, 18, 207, 26);
		telaCliente.getContentPane().add(txtDigiteOCPF);
		txtDigiteOCPF.setColumns(10);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do cliente");
		lblCpfDoCliente.setBounds(12, 85, 112, 17);
		telaCliente.getContentPane().add(lblCpfDoCliente);
		
		txtDigiteOCpf = new JTextField();
		txtDigiteOCpf.setText("Digite o CPF do cliente");
		txtDigiteOCpf.setBounds(142, 81, 207, 26);
		telaCliente.getContentPane().add(txtDigiteOCpf);
		txtDigiteOCpf.setColumns(10);
		
		telaCliente.setVisible(true);
		
	}
	
	public static void main() {
		
	}
}
