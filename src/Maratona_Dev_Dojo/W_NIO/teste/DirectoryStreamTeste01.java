/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.W_maratonadevdojo_NIO.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Home
 */
public class DirectoryStreamTeste01 {

    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\Home\\Documents\\NetBeansProjects\\MaratonaJavaDevDojo");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
