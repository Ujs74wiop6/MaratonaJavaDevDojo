/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_maratonadevdojo_modificadorestatico.dominio;

import E_maratonadevdojo_blocos_inicializacao.dominio.*;

/**
 *
 * @author Fabricio
 */
public class Anime {

    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado quando  a JVM carregar  a classe 
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe e inicializado com valores default ou oque for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    // 5 - Gatter's e Setter's em seguida
    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao");
    }
    
    // o bloco de inicialização static é executado apenas uma vez

    {
        System.out.println("Dentro do bloco de inicialização no static");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
