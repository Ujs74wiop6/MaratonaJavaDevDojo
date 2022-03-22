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
        File fileDiretorio = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\pasta");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println("Diretorio Created: " + isDiretorioCriated);

        File fileArquivoDiretorio = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009\\pasta\\teste.txt");
        boolean isFileCriated = fileArquivoDiretorio.createNewFile();
        System.out.println("File Created: " + isFileCriated);

        File fileRenamed = new File(fileDiretorio, "teste_renomed.txt");
        boolean isRenamedFile = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("File Renamed: " + isRenamedFile);

        File diretorioRenamed = new File("C:\\Users\\fabri\\OneDrive - Etec Centro Paula Souza\\Desktop\\Software\\FBC009", "pasta_2");
        boolean isRenomedDiretorio = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio Renamed: " + isRenomedDiretorio);
    }
}
