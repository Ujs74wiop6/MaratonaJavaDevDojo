/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.H_maratonadevdojo_heranca.dominio;

/**
 *
 * @author Fabricio
 */
//classe filha
public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario ");
    }

    {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionaário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + "recebi o salario de: R$" + this.salario + " este mês");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
