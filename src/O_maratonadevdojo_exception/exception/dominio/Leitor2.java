/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O_maratonadevdojo_exception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author Fabricio
 */
public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechar Leitor 2");
    }
}
