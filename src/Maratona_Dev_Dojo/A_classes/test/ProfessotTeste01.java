/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.A_classes.test;

import Maratona_Dev_Dojo.A_classes.dominio.Professor;

/**
 *
 * @author Fabricio
 */
public class ProfessotTeste01 {

    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Fabio";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println(" Professor:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);
    }
}
