/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_maratonadevdojo_OI.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fabricio
 */
public class FileReaderTeste01 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\teste.txt");
        try ( FileReader fr = new FileReader(file)) {
//            char[] in = new char[77];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
