package maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex06 {

    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 10;
//        char, int, byte, short, enum, String

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println(" *ERRO* Opção Inválida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println(" *ERRO* Valor Invalido");
        }
    }
}
