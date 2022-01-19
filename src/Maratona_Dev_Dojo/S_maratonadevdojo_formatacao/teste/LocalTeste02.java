/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.S_maratonadevdojo_formatacao.teste;

import java.util.Locale;

/**
 *
 * @author Fabricio
 */
public class LocalTeste02 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println("");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
    }
}
