package Amaratonadevdojo_classes.test;

import Amaratonadevdojo_classes.dominio.Estudante;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Fabricio
 */
public class EstudanteTeste02 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
