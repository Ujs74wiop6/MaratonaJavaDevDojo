/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.B_metodos.dominio;

/**
 *
 * @author Fabricio
 */
public class ImpressoraEstudane {

    public void imprime(Estudante estudante) {
        System.out.println("----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan";

    }
}
