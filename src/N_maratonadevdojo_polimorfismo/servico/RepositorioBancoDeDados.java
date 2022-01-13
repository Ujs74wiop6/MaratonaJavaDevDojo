/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package N_maratonadevdojo_polimorfismo.servico;

import N_maratonadevdojo_polimorfismo.repositorio.Repositorio;

/**
 *
 * @author Fabricio
 */
public class RepositorioBancoDeDados implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados...");
    }
    
}
