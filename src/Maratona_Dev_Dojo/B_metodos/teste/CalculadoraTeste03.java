/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.B_metodos.teste;

import Maratona_Dev_Dojo.B_metodos.dominio.Calculadora;

/**
 *
 * @author Fabricio
 */
public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros02(20, 0));

        //Não foi usado System.out.println por que esse é um metodo void
        calculadora.imprimedivideDoisNumeros(86, 0);

    }
}
