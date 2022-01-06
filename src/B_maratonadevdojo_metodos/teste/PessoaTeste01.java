package B_maratonadevdojo_metodos.teste;

import B_maratonadevdojo_metodos.dominio.Pessoa;

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
