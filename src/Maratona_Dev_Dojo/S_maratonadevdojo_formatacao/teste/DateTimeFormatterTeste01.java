/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.S_maratonadevdojo_formatacao.teste;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Fabricio
 */
public class DateTimeFormatterTeste01 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------------------------------");

        LocalDate parse1 = LocalDate.parse("20220118", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-01-18", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-01-18", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-01-18T08:38:41.2843303", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyy/MM/dd

        System.out.println("---------------------------------");

        DateTimeFormatter fomrmatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatterBR = LocalDate.now().format(fomrmatterBR);
        System.out.println(formatterBR);
        LocalDate parseBR = LocalDate.parse("18/01/2022", fomrmatterBR);
        System.out.println(parseBR);

        System.out.println("---------------------------------");

        DateTimeFormatter fomrmatterGR = DateTimeFormatter.ofPattern("dd.MMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(fomrmatterGR);
        System.out.println(formatGR);

        System.out.println("---------------------------------");

        LocalDate parseGR = LocalDate.parse("18.Jan..2022", fomrmatterGR);
        System.out.println(parseGR);

    }
}
