/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.R_Dates.teste;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class CalendarTeste01 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("");
        System.out.println("----------------");
        System.out.println("");
        c.add(Calendar.DAY_OF_MONTH, 0);
        c.roll(Calendar.HOUR, 12);
        Date date = c.getTime();
        System.out.println(date);
        
        //Sun Jan 16 23:27:46 BRT 2022
    }
}
