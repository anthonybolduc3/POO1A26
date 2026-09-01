package semaine02.exemples;

/**
 * Semiane02
 *
 * @author Julien.Brunet, màj Jocelyn Goulet
 * @since 2026
 */

public class Exemple4_PorteeVariables {

    public static void main(String[] args) {
        //a n'est valide que dans le main
        int a = 3;
        //int a = 13; //pour le if plus bas
        Exemple4_PorteeVariables objet = new Exemple4_PorteeVariables();
        System.out.println("Voici a : " + a );

        objet.methode1();
        objet.methode2();

        //b et c sont inconnus ici!

        if (a > 3){
            int d = 10;
            a += d;
            System.out.println("Voici d : " + d );
            System.out.println("Voici a : " + a );

            //b, c et e sont inconnus ici!
        }else{
            int e = 10;
            a -= e;
            System.out.println("Voici e : " + e );
            System.out.println("Voici a : " + a );

            //b, c et d sont inconnus ici!
        }
    }

    public void methode2() {
        //b n'est valide que dans cette methode
        int b = 5;
        b += 8;
        System.out.println("Voici b : " + b );
        //a et c sont inconnus ici!
    }

    public void methode1() {
        //c n'est valide que dans cette methode
        int c = 7;
        System.out.println("Voici c : " + c );

        // a et b sont inconnus ici!
    }
}
