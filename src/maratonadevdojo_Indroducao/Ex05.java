package maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex05 {

    public static void main(String[] args) {
        double salariaAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salariaAnual <= 34712) {
            valorImposto = salariaAnual * primeiraFaixa;
        } else if (salariaAnual >= 34713 && salariaAnual <= 68507) {
            valorImposto = salariaAnual * segundaFaixa;
        } else {
            valorImposto = salariaAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
