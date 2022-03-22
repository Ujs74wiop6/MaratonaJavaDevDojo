/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.teste;

import Maratona_Dev_Dojo.N_polimorfismo.dominio.Computador;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Produto;
import Maratona_Dev_Dojo.N_polimorfismo.dominio.Tomate;
import Maratona_Dev_Dojo.N_polimorfismo.servico.CalcularImposto;

/**
 *
 * @author Fabricio
 */
public class ProdutoTeste03 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        
        CalcularImposto.calcularImposto(tomate);
        System.out.println("------------------------");        
        CalcularImposto.calcularImposto(produto);
    }
}
