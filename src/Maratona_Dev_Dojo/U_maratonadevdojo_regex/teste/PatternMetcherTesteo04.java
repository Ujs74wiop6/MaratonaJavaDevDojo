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
public class PatternMetcherTesteo04 {

    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // [] =  
        // ? = Zero ou uma 
        // * = Zero ou mais 
        // + = Uma ou mais 
        // {n,m} de n até m
        // ()
        // | o(v|c)o Exemplo: ovo | oco
        // $ 
        //.
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
