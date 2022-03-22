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
public class PathTeste01 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\file.txt");
        Path p2 = Paths.get("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009", "file.txt");
        Path p3 = Paths.get("C:", "Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009", "file.txt");
        Path p4 = Paths.get("C:", "Users", "fabri", "OneDrive - Etec Centro Paula Souza", "Desktop", "Software", "FBC009", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());

    }
}
