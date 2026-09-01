package formatif1;

public class FormatifS01 {

    public static void main(String[] args) {
        FormatifS01 obj = new FormatifS01();
        obj.afficherLigne();
        obj.afficherMesInfos();
        obj.afficherLigne();
    }


    public void afficherLigne() {
        System.out.println("*****************************");

    }

    public void afficherMesInfos() {
        System.out.println("Nom : Anthony Bolduc");
        System.out.println("Lieu de naissance : Quebec");
    }


}
