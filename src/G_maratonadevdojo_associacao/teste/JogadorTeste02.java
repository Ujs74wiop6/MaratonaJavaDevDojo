/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_maratonadevdojo_associacao.teste;

import G_maratonadevdojo_associacao.dominio.Jogador;
import G_maratonadevdojo_associacao.dominio.Time;

/**
 *
 * @author Fabricio
 */
public class JogadorTeste02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}