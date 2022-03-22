/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.R_Dates.teste;

import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1642168677661L); //long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
        
    }
}
