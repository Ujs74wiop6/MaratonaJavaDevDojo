/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.R_maratonadevdojo_Dates.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch(dayOfWeek){
            case THURSDAY: 
                addDays = 4; 
                break;
            case FRIDAY: 
                addDays = 3; 
                break;
            case SATURDAY: 
                addDays = 2;
                break;
            default: 
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }

}

public class TemporalAdjusterTeste01 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        System.out.println("----------------------------");
        
        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println("Agora: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());
        
        System.out.println("----------------------------");
        
        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
        System.out.println("Agora: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());
        
        System.out.println("----------------------------");
        
        now = LocalDate.now().withDayOfMonth(19).with(new ObterProximoDiaUtil());
        System.out.println("Agora: " + now);
        System.out.println(now.getDayOfWeek());
        System.out.println("Dia da semana: " + now.getDayOfWeek());
        
        System.out.println("----------------------------");
        
        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println("Agora: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());
        
        System.out.println("----------------------------");
        
        now = LocalDate.now().withDayOfMonth(21).with(new ObterProximoDiaUtil());
        System.out.println("Agora: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());
    }
}
