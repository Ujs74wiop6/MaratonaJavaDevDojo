/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_OI.teste;

import java.io.File;
import java.io.IOException;
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
        File file = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\teste.txt");
        //System.out.println(file);
        try {
            //deleted arquivo here
            //boolean isDeleted = file.delete();
            //created arquivo here
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path absolute: " + file.getAbsolutePath());
            System.out.println("is Directory: " + file.isDirectory());
            System.out.println("is File: " + file.isFile());
            System.out.println("is Hidden: " + file.isHidden());
            System.out.println("Last Mdified: " + new Date(file.lastModified()));

            boolean exist = file.exists();
            if (exist) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
