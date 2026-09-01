package dev_1;


import java.util.Scanner;
import java.text.DecimalFormat;

public class AireEtPerimetre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le diametre du cercle en cm : ");
        //On demande a l'utilisateur d'entrer la valeur qu'il souhaite calculer
        int diametre = sc.nextInt();


//Les differentes variable que l'on calcule et qu'on va utiliser a partir du nombre entrer par l'utilisateur
        double rayon = diametre / 2.0;
        double aire = Math.PI * Math.pow(rayon,2);// on aurait aussi pu faire rayon*rayon. Math.pow,ca s'utilise avec la variable a calculer a gauche et lexposant a droite.
        double circonference = 2*Math.PI*rayon;


        System.out.println("La circonference du cercle est "+circonference + " cm ");
        System.out.println("L'aire du disque est " + aire + " cm carres");






    }


}
