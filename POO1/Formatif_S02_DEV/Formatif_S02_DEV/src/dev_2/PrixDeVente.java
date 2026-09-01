package dev_2;

import java.util.Scanner;


public class PrixDeVente {
    public static void main(String[] args) {
        PrixDeVente obj = new PrixDeVente();

        obj.demanderEtCalculerPrixAchat();//Va executer la methode dans le main,ce qui evite davoir du code dans le main et de le remplir
        obj.demanderEtCalculerPrixAchat();//On l'execute une autre fois comme demander
    }


    public void demanderEtCalculerPrixAchat() {
        Scanner sc = new Scanner(System.in);
        final double TPS = 0.05;//J'utilise une constante puisque cest non modifiable et que ca ne change pas.Aussi,j'utilise une decimale au lieu dun pourcentage.
        final double TVQ = 0.09975;// "

        //Debut du code.
        System.out.println(" ********** Achat ***************");


        System.out.print("Quel fruit avez-vous acheter?");
        String produit = sc.nextLine();

        System.out.print("Quel quantite en avez vous acheter?(En kg )  : ");
        double qte = sc.nextInt();

        System.out.print("Quel est le prix ( en $ /kg) : ");
        double prixParKg = sc.nextDouble();
        sc.nextLine();

        double prixAvantTaxes = qte * prixParKg;//On calcule le prix avant les taxes
        double prixApresTaxes =/*prixAvantTaxes*/+prixAvantTaxes * (1 + TPS + TVQ);//On rajoute les constantes au calcul du prix effectuer precedemment


        System.out.println("Prix des  " + produit + " avant les taxes : " + prixAvantTaxes);

        System.out.println("Prix des  " + produit + " apres  les taxes : " + prixApresTaxes);


    }


}
