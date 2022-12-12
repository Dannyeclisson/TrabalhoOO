package Controle_de_Orcamento;

import java.util;

public class Teste {
    static Pessoa pj;
    static Pessoa pf;
    static Empresa emp;
    static Orcamento orc;
    static Servico ser;
    static Recibo rec;

    public static void main(String[] args) {
        PessoaJuridica pj;
        PessoaFisica pf;
        String nome_do_cliente = "DannDann";

        double valor = 1000.00;

        pf = new PessoaFisica("1234567891");
        emp = new Empresa("983265978", "Teen Years", "Pinturas deccorativas", "Teenyears@gmail.com");
        ser = new Servico("Pintura na casa do lion", valor, "Pintura restaurativa", emp);
        orc = new Orcamento("Orcamento 1", pf, ser);
        rec = new Recibo(valor, orc, nome_do_cliente);
    }

}