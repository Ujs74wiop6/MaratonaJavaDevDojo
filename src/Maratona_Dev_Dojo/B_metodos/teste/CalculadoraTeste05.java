package Maratona_Dev_Dojo.B_metodos.teste;

import Maratona_Dev_Dojo.B_metodos.dominio.Calculadora;

/**
 * @author Fabricio
 */
public class CalculadoraTeste05 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
