/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.servico;

import Maratona_Dev_Dojo.N_polimorfismo.repositorio.Repositorio;

/**
 *
 * @author Fabricio
 */
public class RepositorioMemoria implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salando em Memória...");
    }
    
}
