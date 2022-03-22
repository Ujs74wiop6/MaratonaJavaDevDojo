/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_OI.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabricio
 */
public class FileTeste01 {

    public static void main(String[] args) {
        //Sistema para criação de arquivo: 
        //Abaixo insira o caminho junto ao aquivo que deseja criar...
        File file = new File("C:\\Users\\Home\\Documents\\NetBeansProjects\\MaratonaJavaDevDojo\\arquivo\\file.txt");
        //System.out.println(file);
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory  " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modfied " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
