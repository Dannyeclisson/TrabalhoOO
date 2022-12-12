package Controle_de_Orcamento;

public class Orcamento extends PessoaFisica, PessoaJuridica {

	private String tituloDoOrcamento;

	private String observacaoInicial;

	private int clienteID;

	private int servicoID;

	private PessoaFisica pessoaFisica;

	private PessoaJuridica pessoaJuridica;

	private Serviço serviço;

	private Empresa empresa;

	private Recibo recibo;

	private Pessoa pessoa;

	public Orcamento Orcamento(String tituloDoOrcamento) {
		return null;
	}

	public String definirObservacao() {
		return null;
	}

	public boolean editarTitulo() {
		return false;
	}

	public boolean editarObservacao() {
		return false;
	}

	public boolean deletarObservacao() {
		return false;
	}

}
