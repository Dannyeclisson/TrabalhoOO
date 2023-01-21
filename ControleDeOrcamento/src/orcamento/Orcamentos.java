package orcamento;

public class Orcamentos {

	private String nomeDoServico;
	private double valorDoServico;
	private String  observacoes;
	
	public String getNomeDoServico() {
		return nomeDoServico;
	}
	
	public double getValorDoServico() {
		return  valorDoServico;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setNomeDoServico(String newNomeDoServico) {
		this.nomeDoServico = newNomeDoServico;
	}
	
	public void setValorDoServico(double newValorDoServico) {
		this.valorDoServico = newValorDoServico;
	}
	
	public void setObservacoes(String newObservacoes) {
		this.observacoes = newObservacoes;
	}
}
