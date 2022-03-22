/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.G_associacao.teste;

import Maratona_Dev_Dojo.G_associacao.dominio.Jogador;
import Maratona_Dev_Dojo.G_associacao.dominio.Time;

/**
 *
 * @author Fabricio
 */
public class JogadorTeste03 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogaador---");
        jogador.imprime();

        System.out.println("---Time---");
        time.imprime();
    }
}
