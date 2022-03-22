/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_exception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author Fabricio
 */
public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechar Leitor 1");
    }
}
