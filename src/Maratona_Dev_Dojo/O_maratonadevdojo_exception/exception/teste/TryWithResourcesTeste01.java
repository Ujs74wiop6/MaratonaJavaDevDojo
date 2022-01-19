/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_maratonadevdojo_exception.exception.teste;

import Maratona_Dev_Dojo.O_maratonadevdojo_exception.exception.dominio.Leitor1;
import Maratona_Dev_Dojo.O_maratonadevdojo_exception.exception.dominio.Leitor2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabricio
 */
public class TryWithResourcesTeste01 {

    public static void main(String[] args) {
        lerAquivo();
    }

    public static void lerAquivo() {
        try ( Leitor1 leitor1 = new Leitor1();  
               Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
