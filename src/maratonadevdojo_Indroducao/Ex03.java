package maratonadevdojo_Indroducao;

/**
 * @author Fabricio
 */
public class Ex03 {

    public static void main(String[] args) {
        // idade < 15 categoria Infantil 
        // idade =< 15 && idade < 18 juvenil
        // idade >= 18 categoria adulto

        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
