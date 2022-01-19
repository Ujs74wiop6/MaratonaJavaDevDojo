package Maratona_Dev_Dojo.TiposPrimitivosExemplos;

import java.util.Scanner;

public class TipoDouble {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        
        Double numero1, numero2, resultado;
        
        System.out.println("Sistema para fazer DIVISÃO!!!");
        
        System.out.println("Digite um numero:");
        numero1 = ler.nextDouble();
        
        System.out.println("Digite outro numero:");
        numero2 = ler.nextDouble();
        
        resultado = (numero1/numero2);
        
        System.out.println("O resultado da divisão entre esses dois números é: " + resultado);
    }
}

