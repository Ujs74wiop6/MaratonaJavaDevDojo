/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_maratonadevdojo_associacao.teste;

import G_maratonadevdojo_associacao.dominio.Aluno;
import G_maratonadevdojo_associacao.dominio.Local;
import G_maratonadevdojo_associacao.dominio.Professor;
import G_maratonadevdojo_associacao.dominio.Seminario;

/**
 *
 * @author Fabricio
 */
public class AssociacaoTeste {

    public static void main(String[] args) {
        Local local = new Local("Rua das lanjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar One Pice", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        
        professor.imprime();

    }
}
