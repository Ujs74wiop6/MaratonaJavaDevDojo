package Maratona_Dev_Dojo.B_metodos.teste;

import Maratona_Dev_Dojo.B_metodos.dominio.Pessoa;

/**
 * @author Fabricio
 */
public class PessoaTeste01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }

}
