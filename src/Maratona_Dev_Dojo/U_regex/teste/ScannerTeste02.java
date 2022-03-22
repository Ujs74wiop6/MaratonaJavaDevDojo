/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maratona_Dev_Dojo.U_regex.teste;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ScannerTeste02 {

    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
