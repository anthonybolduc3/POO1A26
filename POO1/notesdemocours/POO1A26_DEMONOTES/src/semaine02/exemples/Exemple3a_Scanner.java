package semaine02.exemples;

import java.util.Scanner;

/**
 * Semiane02
 *
 * @author Julien.Brunet, màj Jocelyn Goulet
 * @since 2026
 */
public class Exemple3a_Scanner {

    public static void main(String[] args) {
        new Exemple3a_Scanner();
    }

    public Exemple3a_Scanner() {
        lireEtAfficherNomPrenom();
        System.out.println("\n");
        lireEtAfficherDesNombresDeBilles();
        System.out.println("\n");
        lireEtAfficherPrenomEtNombreDeBilles();
    }

    /**
     * Saisir avec un objet Scanner un nom et un prénom
     */
    public void lireEtAfficherNomPrenom() {
        Scanner sc = null; //Instance de l'utilitaire de lecture
        String nom = "";
        String prenom = "";

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez votre nom : ");
        //Appel d'une méthode de l'objet Scanner qui récupère une chaine de caractères
        //saisis au clavier.
        nom = sc.nextLine();

        System.out.println("Entrez votre prénom : ");
        prenom = sc.nextLine(); //lecture du prenom

        System.out.println("Bonjour Monsieur ou Madame " + nom);
        System.out.print("Je sais que votre prénom est " + prenom);
    }

    /**
     * Saisit le nombre de billes que possèdent Denis et Louise
     * et affiche le total de leurs billles.
     */
    public void lireEtAfficherDesNombresDeBilles() {
        Scanner sc = new Scanner(System.in); //Instance et instanciation de l'utilitaire de lecture
        int nbBillesDenis = 0;
        int nbBillesLouise = 0;
        int totalBilles = 0;

        System.out.println("Entrez le nombre de billes de Denis : ");
        nbBillesDenis = sc.nextInt();

        System.out.println("Entrez le nombre de billes de Louise : ");
        nbBillesLouise = sc.nextInt();

        totalBilles = nbBillesDenis + nbBillesLouise;

        System.out.println("Denis et Louise ont " + totalBilles + " billes ensembles.");
    }

    /**
     * ATTENTION : Permet de voir l'effet du "Scanner" losrqu'il y a une lecture de chaine de
     * caractères suivant la lecture d'un numérique.
     */
    public void lireEtAfficherPrenomEtNombreDeBilles() {
        Scanner sc = null; //Instance de l'utilitaire de lecture
        int nbBilles = 0;
        String prenom = "";

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez le nombre de billes : ");
        nbBilles = sc.nextInt();

        //Permet de vider le "buffer" (tampon de saisie)  après une lecture numérique
        //sc.nextLine(); //??????

        System.out.println("Entrez le prénom : ");
        prenom = sc.nextLine();

        System.out.println("Vous êtes " + prenom + " et vous avez " + nbBilles + " billes.");
    }
}
