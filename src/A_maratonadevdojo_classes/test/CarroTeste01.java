/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_maratonadevdojo_classes.test;

import A_maratonadevdojo_classes.dominio.Carro;

/**
 *
 * @author Fabricio
 */
public class CarroTeste01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "CORSA";
        carro1.modelo = 'B';
        carro1.ano = 2001;

        carro2.nome = "BMW";
        carro2.modelo = 'C';
        carro2.ano = 2019;
        
//      Referência de objetos
        carro1 = carro2;

        System.out.println("------ Carro n°1 ------");

        System.out.println("Nome do Carro: " + carro1.nome);
        System.out.println("Modelo do Carro: " + carro1.modelo);
        System.out.println("Ano do Carro: " + carro1.ano);

        System.out.println("------ Carro n°2 ------");

        System.out.println("Nome do Carro: " + carro2.nome);
        System.out.println("Modelo do Carro: " + carro2.modelo);
        System.out.println("Ano do Carro: " + carro2.ano);
    }
}
