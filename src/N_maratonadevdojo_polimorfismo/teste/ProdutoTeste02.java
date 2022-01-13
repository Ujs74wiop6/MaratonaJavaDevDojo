/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package N_maratonadevdojo_polimorfismo.teste;

import N_maratonadevdojo_polimorfismo.dominio.Produto;
import N_maratonadevdojo_polimorfismo.dominio.Computador;
import N_maratonadevdojo_polimorfismo.dominio.Tomate;

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
