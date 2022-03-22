/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.Q_String.teste;

/**
 *
 * @author Fabricio
 */
public class StringTeste01 {

    public static void main(String[] args) {
        String nome = "William"; // String constant pool 
        String nome2 = "William";
        nome = nome.concat(" Suane"); // nome += " Suane";
        System.out.println("nome1: " + nome);
        System.out.println("nome2: " + nome2);
        System.out.println(nome == nome2);
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
