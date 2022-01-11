/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J_maratonadevdojo_modificadorfinal.dominio;

/**
 *
 * @author Fabricio
 */
public class Comprador {

    private String nome;

    @Override
    public String toString() {
        return "Comprador{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
