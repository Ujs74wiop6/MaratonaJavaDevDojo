/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amaratonadevdojo_metodos.teste;

import Amaratonadevdojo_metodos.dominio.Calculadora;

/**
 *
 * @author Fabricio
 */
public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(9, 2);
        System.out.println(resultado);
    }
}
