/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M_maratonadevdojo_interfaces.teste;

import M_maratonadevdojo_interfaces.dominio.DataLoader;
import M_maratonadevdojo_interfaces.dominio.DatabaseLoader;
import M_maratonadevdojo_interfaces.dominio.FileLoader;

/**
 *
 * @author Fabricio
 */
public class DataLoaderTeste01 {

    public static void main(String[] args) {
        DatabaseLoader databeseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databeseLoader.load();
        fileLoader.load();

        databeseLoader.remove();
        fileLoader.remove();

        databeseLoader.checkPermission();
        fileLoader.checkPermission();
        
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
