package Indroducao;

/**
 * @author Fabricio
 */
public class Ex09 {

    public static void main(String[] args) {
        //Imprima todos os numeros pares até 10000

        int num = 0;
        while (num <= 10000) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
