/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.P_wrapper.teste;

/**
 *
 * @author Fabricio
 */
public class WrapperTeste01 {

    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("faLsE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('4')); // indentifica num
        System.out.println(Character.isLetterOrDigit('j')); // indentifica se é num ou caracter
        System.out.println(Character.isUpperCase('A')); // indentifica carter Maiusculo 
        System.out.println(Character.isLowerCase('a')); // indentifica carter Minusculo 
        System.out.println(Character.toUpperCase('a')); // converte caracter para Maiusculo
        System.out.println(Character.toLowerCase('A')); // converte caracter para Minusculo
    }
}
