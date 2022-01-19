/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.U_maratonadevdojo_regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fabricio
 */
public class PatternMetcherTeste01 {

    public static void main(String[] args) {
        //fabricioujs74@gmail.com
        String regex = "aba";
        //String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }
}
