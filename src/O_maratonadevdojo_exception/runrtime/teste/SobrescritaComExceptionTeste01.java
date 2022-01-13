/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O_maratonadevdojo_exception.runrtime.teste;

import O_maratonadevdojo_exception.exception.dominio.Funcionario;
import O_maratonadevdojo_exception.exception.dominio.LoginInvalidoException;
import O_maratonadevdojo_exception.exception.dominio.Pessoa;
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
