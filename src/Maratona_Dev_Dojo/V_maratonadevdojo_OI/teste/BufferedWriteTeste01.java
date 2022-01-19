/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_maratonadevdojo_OI.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Fabricio
 */
public class BufferedWriteTeste01 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\teste.txt");
        try ( FileWriter fw = new FileWriter(file, true);  
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O dev dojo é lindo, é o melhor curso do Brasil!!!");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
