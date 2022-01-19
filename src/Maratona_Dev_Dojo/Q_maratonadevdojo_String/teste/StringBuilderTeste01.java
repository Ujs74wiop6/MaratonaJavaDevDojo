/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.Q_maratonadevdojo_String.teste;

/**
 *
 * @author Fabricio
 */
public class StringBuilderTeste01 {

    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }

}
