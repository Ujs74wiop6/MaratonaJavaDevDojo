/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_maratonadevdojo_sobrecargametodos.teste;

import C_maratonadevdojo_sobrecargametodos.domino.Anime;

/**
 *
 * @author Fabricio
 */
public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Ação", "Akuma Drive", "TV", 12);
        anime.imprimir();
    }
}
