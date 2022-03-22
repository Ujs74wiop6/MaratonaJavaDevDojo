/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.N_polimorfismo.teste;

import Maratona_Dev_Dojo.N_polimorfismo.repositorio.Repositorio;
import Maratona_Dev_Dojo.N_polimorfismo.servico.RepositorioArquivo;
import Maratona_Dev_Dojo.N_polimorfismo.servico.RepositorioBancoDeDados;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class RepositorioTeste {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
