/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.L_classesabstratas.teste;

import Maratona_Dev_Dojo.L_classesabstratas.dominio.Desenvolvedor;
import Maratona_Dev_Dojo.L_classesabstratas.dominio.Funcionario;
import Maratona_Dev_Dojo.L_classesabstratas.dominio.Gerente;

/**
 *
 * @author Fabricio
 */
public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imiprime();
        desenvolvedor.imiprime();
    }
}
