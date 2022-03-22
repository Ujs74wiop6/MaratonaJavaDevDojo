package Maratona_Dev_Dojo.B_metodos.teste;

import Maratona_Dev_Dojo.B_metodos.dominio.Estudante;
import Maratona_Dev_Dojo.B_metodos.dominio.ImpressoraEstudane;

/**
 *
 * @author Fabricio
 */
public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estutante01 = new Estudante();
        Estudante estutante02 = new Estudante();
        ImpressoraEstudane impressora = new ImpressoraEstudane();

        estutante01.nome = "Midoriya";
        estutante01.idade = 15;
        estutante01.sexo = 'M';

        estutante02.nome = "Sakura";
        estutante02.idade = 16;
        estutante02.sexo = 'F';

        impressora.imprime(estutante01);
        impressora.imprime(estutante02);

        System.out.println("###############");

        impressora.imprime(estutante01);
        impressora.imprime(estutante02);

    }
}
