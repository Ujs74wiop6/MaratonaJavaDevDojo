/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_maratonadevdojo_associacao.teste;

import G_maratonadevdojo_associacao.dominio.Escola;
import G_maratonadevdojo_associacao.dominio.Professor;

/**
 *
 * @author Fabricio
 */
public class EscolaTeste01 {

    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};  
        Escola escola = new Escola("Konoha", professores);
        
        
        escola.imprime();
        
    }
}
