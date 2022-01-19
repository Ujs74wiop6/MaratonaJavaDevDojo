/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_maratonadevdojo_polimorfismo.dominio;

/**
 *
 * @author Fabricio
 */
public class Televisao extends Produto {
    private static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o Imposto da Televisão...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
