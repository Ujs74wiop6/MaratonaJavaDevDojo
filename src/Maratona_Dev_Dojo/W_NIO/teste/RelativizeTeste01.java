/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.W_NIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Fabricio
 */
public class RelativizeTeste01 {

    public static void main(String[] args) {
        Path dir = Paths.get("/home/fabricio");
        Path clazz = Paths.get("/home/fabricio/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/fabricio");
        Path absoluto2 = Paths.get("/usr/local/");
        Path absoluto3 = Paths.get("/home/fabricio/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + relativo1.relativize(relativo1));
    }
}
