package Maratona_Dev_Dojo.B_maratonadevdojo_metodos.teste;

import Maratona_Dev_Dojo.B_maratonadevdojo_metodos.dominio.Estudante;

/**
 *
 * @author Fabricio
 */
public class EstudanteTeste02 {

    public static void main(String[] args) {

        Estudante estutante01 = new Estudante();
        Estudante estutante02 = new Estudante();

        estutante01.nome = "Midoriya";
        estutante01.idade = 15;
        estutante01.sexo = 'M';

        estutante02.nome = "Sakura";
        estutante02.idade = 16;
        estutante02.sexo = 'F';

        estutante01.imprime();
        estutante02.imprime();
    }
}
