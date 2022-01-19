/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_maratonadevdojo_OI.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Fabricio
 */
public class BufferedReaderTeste01 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\teste.txt");
        try (FileReader fr = new FileReader(file);  
                BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
