/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.H_heranca.teste;

import Maratona_Dev_Dojo.H_heranca.dominio.Endereco;
import Maratona_Dev_Dojo.H_heranca.dominio.Funcionario;
import Maratona_Dev_Dojo.H_heranca.dominio.Pessoa;

/**
 *
 * @author Fabricio
 */
public class HerancaTeste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");

        funcionario.imprime();

    }
}
