/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_maratonadevdojo_heranca.teste;

import H_maratonadevdojo_heranca.dominio.Endereco;
import H_maratonadevdojo_heranca.dominio.Funcionario;
import H_maratonadevdojo_heranca.dominio.Pessoa;

/**
 *
 * @author Fabricio
 */
public class HerancaTeste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");

        funcionario.imprime();

    }
}
