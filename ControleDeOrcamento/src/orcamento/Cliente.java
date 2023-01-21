
package orcamento;

import java.util.ArrayList; 

public class Cliente {

		private String nome;
		private String cpf;
		private String email;
		
		
		public String getNome() {
			return nome;
		}
		
		public String getCpf() {
			return  cpf;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setNome(String newNome) {
			this.nome =  newNome;
		}
		
		public void setCpf(String newCpf) {
			this.cpf = newCpf;
		}
		
		public void  setEmail(String newEmail) {
			this.email = newEmail;
		}
	}


