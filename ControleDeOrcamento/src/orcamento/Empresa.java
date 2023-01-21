package orcamento;

public class Empresa {

	private String razaoSocial;
	private String cnpj;
	private String ramo;
	private String email;
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public String getRamo() {
		return ramo;
	}	
	
	public String getEmail() {
		return email;
	}
	
	public void setRazaoSocial(String newRazaoSocial) {
		this.razaoSocial = newRazaoSocial;
	}
	
	public void setCnpj(String newCnpj) {
		this.cnpj = newCnpj;
	}
	
	public void setRamo(String newRamo) {
		this.ramo =  newRamo;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
}
