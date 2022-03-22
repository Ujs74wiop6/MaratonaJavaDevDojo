/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.S_formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Fabricio
 */
public class LocalTeste01 {

    public static void main(String[] args) {
        //pt-BR
        Locale localeItaly = new Locale("it", " IT");
        Locale localeUnitedStates = new Locale("it", " CH");
        Locale localeJapan = new Locale("ja", " JP");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("United States of America: " + df2.format(calendar.getTime()));
        System.out.println("Japan: " + df3.format(calendar.getTime()));
        
        System.out.println("-------------------------------");
        
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeUnitedStates.getDisplayCountry());
    }
}
