package semaine02;

public class FormatifS02 {

    public static void main(String[] args) {

        FormatifS02 obj = new FormatifS02();

        obj.division1();
        obj.division2();
        obj.division3();
        obj.denanderEtafficherInformation();
        obj.methodePourTrace();
        obj.afficherEnHeureMinutesSecondes();
        obj.echangerVariable();

    }


    public void division1() {

        int nb; // entier

        nb = 15 / 3;
        System.out.println(" 15 / 3 : " + nb);

        nb = 10 / 3;
        System.out.println(" 10 / 3 : " + nb);

        nb = 2 / 3;
        System.out.println(" 2 / 3 : " + nb);

    }

    public void division2() {

        double nb; // entier

        nb = 15 / 3;
        System.out.println(" 15 / 3 : " + nb);

        nb = 10 / 3;
        System.out.println(" 10 / 3 : " + nb);

        nb = 2 / 3;
        System.out.println(" 2 / 3 : " + nb);

    }

    public void division3() {
        double nb; // nombre réel


        nb = 15.0 / 3;
        System.out.println(" 15,0 / 3 : " + nb);

        nb = 10.0 / 3;
        System.out.println(" 10.0 / 3 : " + nb);

        nb = 2.0 / 3;
        System.out.println(" 2.0 / 3 : " + nb);


    }


    public void denanderEtafficherInformation() {

        String nom = "Anthony Bolduc";
        int anneeNaissance = 2005;
        int age = 2026 - anneeNaissance;
        double taille = 1.86;


        System.out.println("Bonjour ! " + nom);
        System.out.println("Vous êtes ne en " + anneeNaissance);
        System.out.println("Cette annee est celle de vos " + age + " ans !");
        System.out.println("Vous mesurez " + taille + "m");

    }


    public void methodePourTrace() {
        int a = 5;
        int b = 2;                  //ligne 1
        a += b;                     //ligne 2
        b++;                        //ligne 3
        a *= 2;                     //ligne 4
        System.out.println(a % b);    //ligne 5
        System.out.println(a--);    //ligne 6
        System.out.println(a);      //ligne 7


    }

    public void afficherEnHeureMinutesSecondes() {
        int sec = 176389;
        int secondes = sec % 60;
        int heures = sec / 3600;
        int minutes = (sec % 3600) / 60;


        System.out.println(sec + " secondes correspondent a " + heures + " heures " + minutes + " minutes et " + secondes + " secondes");
    }


    public void echangerVariable() {
        int a = 3;
        int b = 10;
        System.out.println("Avant échange: a = " + a + " b = " + b);
        //Ajouter du code ici qui permet de mettre la valeur de a dans b


        int variableEchange = a;
        //C est la variable temporaire qui va conserver la valeur de a
        a = b;
        b = variableEchange;


        //et celle de b dans a....
        System.out.println("Après échange: a = " + a + " b = " + b);
    }


}




