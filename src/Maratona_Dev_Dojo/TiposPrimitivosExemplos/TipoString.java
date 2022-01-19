    package Maratona_Dev_Dojo.TiposPrimitivosExemplos;

import java.util.Scanner;

public class TipoString {
    
        
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;

        System.out.println("Qual seu nome ? ");
        nome = ler.next();
        
        System.out.println("Olá Sr." + nome + " como vai??");

    }
}
