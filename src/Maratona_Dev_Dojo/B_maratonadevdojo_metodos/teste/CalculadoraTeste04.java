/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.B_maratonadevdojo_metodos.teste;

import Maratona_Dev_Dojo.B_maratonadevdojo_metodos.dominio.Calculadora;

/**
 *
 * @author Fabricio
 */
public class CalculadoraTeste04 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}
