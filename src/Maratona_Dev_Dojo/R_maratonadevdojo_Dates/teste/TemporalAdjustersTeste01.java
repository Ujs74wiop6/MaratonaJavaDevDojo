/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.R_maratonadevdojo_Dates.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Fabricio
 */
public class TemporalAdjustersTeste01 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 17);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
