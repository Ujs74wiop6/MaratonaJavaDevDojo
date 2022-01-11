/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_maratonadevdojo_classesabstratas.dominio;

/**
 *
 * @author Fabricio
 */
public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imiprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
