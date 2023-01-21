package orcamento;

public class Main {

	public static void main(String[] args) {
		
		
		
		Cliente myObj = new Cliente();
		myObj.setNome("DannDann");
		myObj.setCpf("12345678");
		myObj.setEmail("dannyeclissonrodrigo@gmail.com");
		
		String [][] array1 = {{"1", "2", "3"},  {myObj.getNome(), myObj.getCpf(), myObj.getEmail()}};
						
		Empresa myObj2 = new Empresa(); 
		myObj2.setRazaoSocial("DD Construeletrica");
		myObj2.setCnpj("0987654321");
		myObj2.setRamo("Contruçao e eletrica");
		myObj2.setEmail("ddconstrueletrica@gmail.com");
		
		Orcamentos myObj3 =  new Orcamentos();
		myObj3.setNomeDoServico("Reforma na casa do DannDann");
		myObj3.setValorDoServico(8000.00);
		myObj3.setObservacoes("Troca de fiação eletrica e reforma nas estruturas da casa");
		
		System.out.printf(" Nome do Cliente: %s\n CPF do Cliente: %s\n E-mail do cliente: %s\n", myObj.getNome(), myObj.getCpf(), myObj.getEmail());
		//System.out.println("Valores do array sao");
		System.out.printf("\n Razão social da empresa: %s\n CNPJ da empresa: %s\n Ramo da empresa: %s\n Email da empresa: %s\n ", myObj2.getRazaoSocial(), myObj2.getCnpj(), myObj2.getRamo(), myObj2.getEmail());
		System.out.printf("\n Titulo do serviço: %s\n Valor do serviço: %.2f\n Descrição dos serviços: %s\n ", myObj3.getNomeDoServico(), myObj3.getValorDoServico(), myObj3.getObservacoes());
	
	}	
	
	public static void  outputArray(String[][] array) {
		

		outputArray ( array1 );
	}
}
