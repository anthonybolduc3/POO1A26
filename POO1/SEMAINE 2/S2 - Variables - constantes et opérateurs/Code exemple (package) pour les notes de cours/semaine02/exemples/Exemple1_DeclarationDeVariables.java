package semaine02.exemples;

/**
 * Semiane02
 *
 * @author Julien.Brunet, màj Jocelyn Goulet
 * @since 2026
 */

public class Exemple1_DeclarationDeVariables {
    public static void main(String[] args) {
        byte a = 126;
        short b = 3333;
        int c = -12;
        long d = 999999999999999999l;

        double nombreDecimal1 = 3.5;
        float nombreDecimal2 = 3.0f;

        char unCaractere = 'a'; // attention aux délimiteurs ' '

        System.out.println("unCaractère = " + unCaractere);

        //Table ASCII : https://www.rapidtables.com/code/text/ascii-table.html
        char autre = 123; //Code ascii, un "char" est un "int" à la base !!!
        System.out.println("autre = " + autre);

        boolean succes = true;

        String maChaine = "Salut à tous...";

        System.out.println("Voici la valeur de succes : " + succes);
        System.out.println("Voici la valeur de maChaine : " + maChaine);
    }
}
