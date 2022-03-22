package Maratona_Dev_Dojo.B_metodos.teste;

import Maratona_Dev_Dojo.B_metodos.dominio.Funcionario;

/**
 * @author Fabricio
 */
public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
