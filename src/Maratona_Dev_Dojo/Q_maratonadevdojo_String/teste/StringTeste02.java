/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.Q_maratonadevdojo_String.teste;

/**
 *
 * @author Fabricio
 */
public class StringTeste02 {

    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.print(nome.charAt(0));
        System.out.print(nome.charAt(1));
        System.out.print(nome.charAt(2));
        System.out.print(nome.charAt(3));
        System.out.print(nome.charAt(4));
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");
        System.out.println(nome.length()); // faz a numeração de caracter
        System.out.println(nome.replace("L", "X")); // troca o caracter
        System.out.println(nome.toLowerCase()); // converte par Minusculo
        System.out.println(nome.toUpperCase()); // converte para Maiusculo
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");
        System.out.println(numeros.substring(4, numeros.length())); // ele fornece os valores apartir do valor fornecido
        System.out.println(nome);
        System.out.println(nome.trim()); // elimina os espaços em branco
        
    }
}
