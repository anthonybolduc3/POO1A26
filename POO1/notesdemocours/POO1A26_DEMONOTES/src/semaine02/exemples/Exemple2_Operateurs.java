package semaine02.exemples;

/**
 * Semiane02
 *
 * @author Julien.Brunet, màj Jocelyn Goulet
 * @since 2026
 */
public class Exemple2_Operateurs {

    public static void main(String[] args) {
        Exemple2_Operateurs objEx2 = new Exemple2_Operateurs();

        System.out.println("**** testerOperateurArithmetiques ****");
        objEx2.testerOperateurArithmetiques();
        System.out.println("**************************************\n");

        System.out.println("**** testerOperteursAffectation ****");
        objEx2.testerOperteursAffectation();
        System.out.println("**************************************\n");

        System.out.println("**** testerOperateursIncrementation ****");
        objEx2.testerOperateursIncrementation();
        System.out.println("**************************************\n");

        System.out.println("**** testerOperateursRelationnels ****");
        objEx2.testerOperateursRelationnels();
        System.out.println("**************************************\n");

        System.out.println("**** testerPriorite ****");
        objEx2.testerPriorite();
        System.out.println("**************************************\n");

        System.out.println("**** testerDepassementByte ****");
        objEx2.testerDepassementByte();
        System.out.println("**************************************\n");
    }

    public void testerOperateurArithmetiques() {

        int somme = 2 + 5;
        System.out.println("En int : 2 + 5 = " + somme);
        double sommeDecimale = 2 + 5;
        System.out.println("En double: 2.0 + 5.0 = " + sommeDecimale);

        int quotient = 19 / 5;
        System.out.println("En int : 19/5 = " + quotient);
        double quotientDecimal = 19.0 / 5.0;
        System.out.println("En double: 19.0/5.0 = " + quotientDecimal);

        int reste = 19 % 5;
        System.out.println("% le reste = " + reste);

        reste = -13 % 10;
        System.out.println("% le reste = " + reste);
    }

    public void testerOperteursAffectation() {
        int a = 10;
        a += 3;
        System.out.println("si a = 10 alors a += 3, = " + a);

        a = 10;
        a -= 5;
        System.out.println("si a = 10 alors a -= 5, = " + a);

        a = 10;
        System.out.println("si a = 10 alors a - 5, = " + (a - 5));
        System.out.println("mais 'a' est toujours = " + a);
    }

    public void testerOperateursIncrementation() {
        int a = 3;
        System.out.println("a = " + a);
        int b = ++a;
        System.out.println("b = ++a, b = " + b);
        System.out.println("a = " + a);
        System.out.println();

        a = 3;
        System.out.println("a = 3, a = " + a);
        b = a++;
        System.out.println("b = a++, b = " + b);
        System.out.println("a = " + a);
        System.out.println();

        int x = 5;
        System.out.println("x = " + x);
        System.out.println("x++ = " + x++);
        System.out.println("Nouvelle valeur de x " + x);
        System.out.println();

        x = 5;
        System.out.println("x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("Nouvelle valeur de x " + x);
        System.out.println();

        //Expressions
        //++
        x = 5;
        System.out.println("x = " + x);
        System.out.println("(++x + 2) = " + (++x + 2));
        System.out.println("Nouvelle valeur de x " + x);
        System.out.println();

        x = 5;
        System.out.println("x = " + x);
        System.out.println("(x++ + 2) = " + (x++ + 2));
        System.out.println("Nouvelle valeur de x " + x);
        System.out.println();

        //--
        x = 5;
        System.out.println("x = " + x);
        System.out.println("(--x + 2) = " + (--x + 2));
        System.out.println("Nouvelle valeur de x " + x);
        System.out.println();

        x = 5;
        System.out.println("x = " + x);
        System.out.println("(x-- + 2) = " + (x-- + 2));
        System.out.println("Nouvelle valeur de x " + x);
    }

    public void testerDepassementByte() {
        int a = 127;
        System.out.println("a = " + a + ", avant a++");
        a++;
        System.out.println("a = " + a + ", après a++");

        byte b = 127;
        System.out.println("b = " + b + ", avant b++");
        b++;
        System.out.println("b = " + b + ", après b++");
    }


    public void testerOperateursRelationnels() {
        int a = 5, b = 10, c = 10;

        System.out.println("Pour a = " + a + ", b = " + b + ", c = " + c + "\n");
        System.out.println("a == b, = " + (a == b));
        System.out.println("a > b, = " + (a > b));
        System.out.println("a < b, = " + (a < b));
        System.out.println("b == c, = " + (b == c));
        System.out.println("b <= c, = " + (b <= c));
        System.out.println("b >= c, = " + (b >= c));
        System.out.println("b < c, = " + (b < c));
        System.out.println("b > c, = " + (b < c));
    }

    public void testerPriorite() {
        int a = 0, b = 0, c = 0, d = 0;
        a = 5;
        b = 10;
        c = 2;

        d = a + b * c;
        // Le compilateur fera (b * c) + a = 25
        System.out.println("d = " + d);

        d = c * b / 2;
        // le compilateur fera c * b / 2 = 10
        System.out.println("d = " + d);

        d = (a + b) * c;
        // Le compilateur fera (a + b) * c = 30
        System.out.println("d = " + d);

        d = c * (b / 2);
        // Le compilateur fera (b / 3) * c = 10
        System.out.println("d = " + d);
    }
}
