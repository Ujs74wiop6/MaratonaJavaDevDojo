/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_OI.teste;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Fabricio
 */
//File
//File Write
//File Reader
//Buffered Write
//Buffered Reader
public class FileWriterTeste01 {

    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DeveDojo é lindo, é o melhor curso do Brasilll\nTestando a próxima linha...\n");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
