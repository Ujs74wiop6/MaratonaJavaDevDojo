/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_maratonadevdojo_contrutores.teste;

import D_maratonadevdojo_contrutores.dominio.Anime;

/**
 *
 * @author Fabricio
 */
public class AnimeTeste01 {

    public static void main(String[] args) {

        // requisitando valores do construtor
        Anime anime = new Anime("Ação", "Haijyuu", "TV", 12, "Tezuka Productions");

        //requisitando valores do init
        //anime.init("Ação", "Akuma Drive", "TV", 12);
        anime.imprimir();
    }
}
