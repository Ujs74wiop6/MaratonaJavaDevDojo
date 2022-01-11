/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_maratonadevdojo_classesabstratas.dominio;

/**
 *
 * @author Fabricio
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    @Override
    public void imiprime() {
        System.out.println("Imprimindo...");
    }
}
