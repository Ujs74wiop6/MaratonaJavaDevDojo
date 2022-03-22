/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.G_associacao.teste;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class LeituraDoTecladoTeste01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo:");
        char sexo = entrada.next().charAt(0);

        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }
}
