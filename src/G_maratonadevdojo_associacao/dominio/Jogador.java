/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_maratonadevdojo_associacao.dominio;

/**
 *
 * @author Fabricio
 */
public class Jogador {

    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
