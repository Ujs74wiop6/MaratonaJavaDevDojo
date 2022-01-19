package Maratona_Dev_Dojo.TiposPrimitivosExemplos;

import java.util.Scanner;

public class TipoInteger {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        Integer numero1, numero2, resultado;
        
        System.out.println("Digite um numero para fazer uma SOMA:");
        numero1 = ler.nextInt();
        
        System.out.println("Digite outro numero:");
        numero2 = ler.nextInt();
        
        resultado = numero1 + numero2;
        
        System.out.println("O resultado da soma dos dois números é " + resultado);
    }
    
}
