/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.H_heranca.teste;

import Maratona_Dev_Dojo.H_heranca.dominio.Funcionario;

/**
 *
 * @author Fabricio
 */
public class HerancaTeste02 {

    // 0 - Bloco de inicialização estático da super_classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub_classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da super_classe
    // 3 - Cada atributo de super_classe é criado e inicializado com valores default ou oque for passado
    // 4 - Bloco de inicialização da super_classe é executado na ordem em que aparece
    // 5 - Construtor é executado da super_classe 
    // 6 - Alocado espaço em memória pro objeto da sub_classe
    // 7 - Cada atributo de sub_classe é criado e inicializado com valores default ou oque for passado
    // 8 - Bloco de inicialização da sub_classe é executado na ordem em que aparece
    // 9 - Construtor é executado da sub_classe
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
