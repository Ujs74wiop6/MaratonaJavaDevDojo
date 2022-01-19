/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_maratonadevdojo_exception.runrtime.teste;

import java.io.IOException;

/**
 *
 * @author Fabricio
 */
public class RunTimeExeceptionTeste02 {

    public static void main(String[] args) throws IOException {
        divisao(1, 0);

        System.out.println("Código finalizado...");
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero;
     */
    private static int divisao(int a, int b){
        if (b == 0) {
            throw new RuntimeException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
