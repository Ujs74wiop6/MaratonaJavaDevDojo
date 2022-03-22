/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_exception.exception.dominio;

import java.io.FileNotFoundException;

/**
 *
 * @author Fabricio
 */
public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionario...");
    }

}
