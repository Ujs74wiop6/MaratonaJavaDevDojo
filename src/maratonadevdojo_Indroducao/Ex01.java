package Maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex01 {

    public static void main(String[] args) {
        // OPERADORES --> + - / *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // ("<"(menor)) 
        // (">"(maior))
        // ("!="(Diferente))
        // ("=="(Igual))
        // ("<="(maior que...))
        // (">="(menor que...))
        boolean isVinteMaiorQueDez = 20 > 10; // return --> true
        boolean isDezMaiorQueVinte = 10 > 20; // return --> false
        boolean isDezMenorQueVinte = 10 < 20; // return --> true
        boolean isVinteMenorQueDez = 20 < 10; // return --> false
        
        // && (AND) e
        
        int idade = 36;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        
        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);
        
        // || (OR) ou
                
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystaion =5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystaion || valorTotalContaPoupanca > valorPlaystaion;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel );
        
        // (=) (+=) (-=) (*=) (/=) (%=)
        
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 00
        System.out.println(bonus);
        
        //
        
        int contador = 0;
        contador += 1; // contador =  contador +1;
        contador++; // contador +1;
        contador--; // contador -1;
        System.out.println(contador);
        
    }

}
