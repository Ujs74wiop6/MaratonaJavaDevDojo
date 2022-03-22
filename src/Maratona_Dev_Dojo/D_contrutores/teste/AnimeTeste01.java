/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.D_contrutores.teste;

import Maratona_Dev_Dojo.D_contrutores.dominio.Anime;

/**
 *
 * @author Fabricio
 */
public class AnimeTeste01 {

    public static void main(String[] args) {

        // requisitando valores do construtor
        Anime anime = new Anime("Ação", "Haijyuu", "TV", 12, "Production IG");

        //requisitando valores do init
        //anime.init("Ação", "Akuma Drive", "TV", 12);
        anime.imprimir();
    }
}
