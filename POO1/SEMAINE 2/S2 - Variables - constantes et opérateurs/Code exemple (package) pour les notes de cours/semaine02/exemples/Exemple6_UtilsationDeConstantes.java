package semaine02.exemples;

/**
 * Semaine02
 *
 * @author Julien.Brunet, màj Jocelyn Goulet
 * @since 2026
 */
public class Exemple6_UtilsationDeConstantes {

    public static final double VITESSE_LUMIERE = 29979458;

    public static void main(String[] args) {

        final double VITESSE_SON = 343;
        System.out.println("Constante de classe -- La vitesse de la lumière est à = " + VITESSE_LUMIERE);
        System.out.println("Voici une constante définie dans de la méthode : " + VITESSE_SON);

        System.out.println();
        new Exemple6_UtilsationDeConstantes().test();
    }

    public void test() {
        System.out.println("Voici une constante définie hors de la méthode (depuis n'importe ou! : " + VITESSE_LUMIERE);
        //On ne peut pas accéder à VITESSE_SON ici,il est inaccessible
    }
}
