/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package N_maratonadevdojo_polimorfismo.teste;

import N_maratonadevdojo_polimorfismo.dominio.Computador;
import N_maratonadevdojo_polimorfismo.dominio.Televisao;
import N_maratonadevdojo_polimorfismo.dominio.Tomate;
import N_maratonadevdojo_polimorfismo.servico.CalcularImposto;

/**
 *
 * @author Fabricio
 */
public class ProdutoTeste01 {

    public static void main(String[] args) {

        Computador computador = new Computador("NUC10 i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);
        
        CalcularImposto.calcularImposto(computador);
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        CalcularImposto.calcularImposto(televisao);

    }
}
