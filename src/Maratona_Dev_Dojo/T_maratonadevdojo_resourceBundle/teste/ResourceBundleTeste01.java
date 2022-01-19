/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.T_maratonadevdojo_resourceBundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ResourceBundleTeste01 {

    public static void main(String[] args) {
        System.out.println("Locale: " + Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
//        System.out.println(bundle.getString("hello"));
//        System.out.println(bundle.getString("good.morning"));
//        System.out.println(bundle.getString("good.afternoon"));
//
//        System.out.println("----------------------------");
//
        System.out.println("Locale: " + Locale.US);
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
//        System.out.println(bundle.getString("hello"));
//        System.out.println(bundle.getString("good.morning"));
//        System.out.println(bundle.getString("good.afternoon"));

        System.out.println("----------------------");
        System.out.println("Tradutor_do_pai `;)");

        Scanner teclado = new Scanner(System.in);
        String text;

        System.out.println("Digite algo...");
        text = teclado.next();

        System.out.println(bundle.getString(text));

    }
}
