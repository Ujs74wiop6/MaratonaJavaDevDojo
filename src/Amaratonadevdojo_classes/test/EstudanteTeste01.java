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
public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Fabricio";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
