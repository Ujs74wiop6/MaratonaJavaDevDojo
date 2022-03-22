/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.teste;

import Maratona_Dev_Dojo.N_polimorfismo.dominio.Produto;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Computador;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Tomate;

/**
 *
 * @author Fabricio
 */
public class ProdutoTeste02 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        
        System.out.println("-------------------------");
        
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
