/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.E_blocos_inicializacao.teste;

import Maratona_Dev_Dojo.E_blocos_inicializacao.dominio.Anime;

/**
 *
 * @author Fabricio
 */
public class AimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        
        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
