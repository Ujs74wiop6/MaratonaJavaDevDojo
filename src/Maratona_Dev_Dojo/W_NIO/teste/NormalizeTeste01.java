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
public class NormalizeTeste01 {

    public static void main(String[] args) {
        String diretorioProjeto = "home/fabricio/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./fabricio/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
