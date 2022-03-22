/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.S_formatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class SimpleDateFormatTeste01 {

    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Brasil 17 de janeiro de 2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
