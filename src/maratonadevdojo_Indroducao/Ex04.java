package Maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex04 {

    public static void main(String[] args) {
        double salario = 400;
        String mensagemDoar = "Eu vou doar pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condição, mas vou ver!!!";

        if (salario > 500) {
            System.out.println(mensagemDoar);
        } else {
            System.out.println(mensagemNaoDoar);
        }
    }
}
