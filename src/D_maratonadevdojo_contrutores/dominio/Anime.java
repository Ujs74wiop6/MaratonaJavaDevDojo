/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_maratonadevdojo_contrutores.dominio;

/**
 *
 * @author Fabricio
 */
public class Anime {

    private String genero;
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;

    public Anime(String genero, String nome, String tipo, int episodios, String estudio) {
        this();
        this.genero = genero;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.estudio = estudio;
    }

    public Anime() {

    }

    public void imprimir() {
        System.out.println(this.genero);
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio() {
        return this.estudio;
    }
}
