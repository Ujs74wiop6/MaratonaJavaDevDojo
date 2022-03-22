/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.O_exception.exception.teste;

import Maratona_Dev_Dojo.O_exception.exception.dominio.LoginInvalidoException;
import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class LoginInvalidoExceptionTeste01 {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String usarnameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usarnameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if (!usarnameDB.equals(usarnameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!!!");
    }
}
