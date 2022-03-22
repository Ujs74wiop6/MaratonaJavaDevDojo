/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.V_OI.teste;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Fabricio
 */
public class FileTeste02 {

    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio Criado: " + isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo Criado: " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo Renomeado: " + isFileRenamed);
        
        File diretorioRenomed = new File("pasta2");
        boolean isDiretorioRenomed = fileDiretorio.renameTo(diretorioRenomed);
        System.out.println("Diretorio Renomeado: " + isDiretorioRenomed);
    }
}
