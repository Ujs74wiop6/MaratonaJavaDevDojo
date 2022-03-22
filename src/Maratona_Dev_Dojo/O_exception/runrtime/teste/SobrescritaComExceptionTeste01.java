/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_exception.runrtime.teste;

import Maratona_Dev_Dojo.O_exception.exception.dominio.Funcionario;
import Maratona_Dev_Dojo.O_exception.exception.dominio.LoginInvalidoException;
import Maratona_Dev_Dojo.O_exception.exception.dominio.Pessoa;
import java.io.FileNotFoundException;

/**
 *
 * @author Fabricio
 */
public class SobrescritaComExceptionTeste01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
