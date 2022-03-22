/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.Q_String.teste;

/**
 *
 * @author Fabricio
 */
public class StringPerformanceTeste01 {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1_000_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar a String: " + (fim - inicio) + " ms");
        System.out.println("Tempo gasto para executar a String: " + (fim - inicio) / 1000 + " seg");

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar a StringBuilder: " + (fim - inicio) + " ms");
        System.out.println("Tempo gasto para executar a StringBuilder: " + (fim - inicio) / 1000 + " seg");

        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar a StringBuffer: " + (fim - inicio) + " ms");
        System.out.println("Tempo gasto para executar a StringBuffer: " + (fim - inicio) / 1000 + " seg");
    }

    private static void concatString(int tamanho) {
        String texto = "Olá meu nome é Fabricio";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sf.append(i);
        }
    }
}
