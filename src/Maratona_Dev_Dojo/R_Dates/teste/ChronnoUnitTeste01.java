/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.R_Dates.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Fabricio
 */
public class ChronnoUnitTeste01 {

    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2022, Month.SEPTEMBER, 9, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        
        //Sistema para saber exatamente quanto tempo falta para o seu ANIVERSÁRIO...
        //Em dias, semanas, messes e até anos!!!
        System.out.println(ChronoUnit.DAYS.between(now, aniversario));
        System.out.println(ChronoUnit.WEEKS.between(now, aniversario));
        System.out.println(ChronoUnit.MONTHS.between(now, aniversario));
        System.out.println(ChronoUnit.YEARS.between(now, aniversario));
    }
}
