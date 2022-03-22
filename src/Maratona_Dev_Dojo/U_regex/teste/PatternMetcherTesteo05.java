/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.U_regex.teste;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fabricio
 */
public class PatternMetcherTesteo05 {// \d = Todos os dígitos
    // \D = Tudo o que não for dígito
    // \s = Espaços em branco \t \n \f \r
    // \S = Todos os caracters excluindo os brancos
    // \w = a-ZA-Z, dígitos, _
    // \W = Tudo que não for incluso no \w
    // []   
    // ? = Zero ou uma 
    // * = Zero ou mais 
    // + = Uma ou mais 
    // {n,m} de n até m
    // ()
    // | o(v|c)o Exemplo: ovo | oco
    // $ 
    //.

    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // []   
        // ? = Zero ou uma 
        // * = Zero ou mais 
        // + = Uma ou mais 
        // {n,m} de n até m
        // ()
        // | o(v|c)o Exemplo: ovo | oco
        // $ 
        //.
        String regex = "([a-zA-Z0-9\\._])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email valido: " + "!@#zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
