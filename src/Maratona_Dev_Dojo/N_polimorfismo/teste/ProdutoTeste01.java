/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.teste;

import Maratona_Dev_Dojo.N_polimorfismo.dominio.Computador;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Televisao;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Tomate;
import Maratona_Dev_Dojo.N_polimorfismo.servico.CalcularImposto;

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
