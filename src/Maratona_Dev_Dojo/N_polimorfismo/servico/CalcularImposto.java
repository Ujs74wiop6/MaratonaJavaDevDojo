/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.servico;

import Maratona_Dev_Dojo.N_polimorfismo.dominio.Produto;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Computador;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Tomate;

/**
 *
 * @author Fabricio
 */
public class CalcularImposto {

//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("----Relatório de Imposto do computador----");
//        double imposto = computador.calcularImposto();
//        System.out.println("Imposto do *Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("----Relatório de Imposto do tomate----");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Imposto do *Tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            
            System.out.println(dataValidade);
        }
    }
}
