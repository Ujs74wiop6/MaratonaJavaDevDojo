/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.F_maratonadevdojo_modificadorestatico.dominio;

/**
 *
 * @author Fabricio
 */
public class Carro {

    private String nome;
    private double velocidadaMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadaMaxima) {
        this.nome = nome;
        this.velocidadaMaxima = velocidadaMaxima;
    }

    public void imprime() {
        System.out.println("--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadaMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }
    
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadaMaxima() {
        return velocidadaMaxima;
    }

    public void setVelocidadaMaxima(double velocidadaMaxima) {
        this.velocidadaMaxima = velocidadaMaxima;
    }

}
