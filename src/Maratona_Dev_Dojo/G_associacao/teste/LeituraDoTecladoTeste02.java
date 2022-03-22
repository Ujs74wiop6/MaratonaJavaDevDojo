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
public class LeituraDoTecladoTeste02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software the previsao do futuro:");
        System.out.println("Digite sua pergunta e eu responderei sim ou não...");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
