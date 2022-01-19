/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.J_maratonadevdojo_modificadorfinal.teste;

import Maratona_Dev_Dojo.J_maratonadevdojo_modificadorfinal.dominio.Carro;
import Maratona_Dev_Dojo.J_maratonadevdojo_modificadorfinal.dominio.Comprador;
import Maratona_Dev_Dojo.J_maratonadevdojo_modificadorfinal.dominio.Ferrari;

/**
 *
 * @author Fabricio
 */
public class CarroTeste01 {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }

}
