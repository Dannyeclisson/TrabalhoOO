package Controle_de_Orcamento;

public abstract class Cliente {

	protected String nome_do_cliente;

	protected String endereco_do_cliente;

	protected String email_cliente;

	private Orcamento orcamento;

	private Pessoa pessoa;

	public String definirNome() {
		return null;
	}

	public String definirEndereco() {
		return null;
	}

	public String definirEmail() {
		return null;
	}

	public boolean editarEndereco() {
		return false;
	}

	public boolean editarNome() {
		return false;
	}

	public boolean editarEmail() {
		return false;
	}

}
