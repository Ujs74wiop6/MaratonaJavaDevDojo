package maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex07 {

    public static void main(String[] args) {
        // Dados os valor de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo

        byte dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("ÚTIL");
                break;
            default:
                System.out.println("ERRO, Valor Invalido");
                break;
        }
    }
}
