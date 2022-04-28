package cat.ilg;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Persona p1 = new Persona();

        //p1.canviarNom("Marc");
        //p1.assignarDni("22222222A");
        //String dades = p1.obtenirDades();
        //System.out.println(dades);

        Estudiant e = new Estudiant();
        e.assignarDni("33333333R");
        e.posarNota(7.5);
        e.canviarNom("Pepito");
        String dades= e.obtenirDades();
        //System.out.println(dades);

        Estudiant e2 = new Estudiant();
        e2.assignarDni("34343434R");
        e2.posarNota(-9);
        e2.canviarNom("Bilal");
        dades= e2.obtenirDades();
        //System.out.println(dades);

        Professor pr = new Professor();
        pr.canviarNom("Juanito");
        pr.assignarDni("44444444S");
        pr.canviarSou(2500);
        dades = pr.obtenirDades();
        //System.out.println(dades);

        Professor pr2 = new Professor();
        pr2.canviarNom("Sheila");
        pr2.assignarDni("77777777F");
        pr2.canviarSou(4000);
        dades = pr2.obtenirDades();
        //System.out.println(dades);

        Substitur subs = new Substitur();
        subs.canviarNom("Pedro");
        subs.assignarDni("55555555E");
        subs.canviarSou(2000);
        Date dataInici = new Date(2022,4,13);
        Date dataFi = new Date(2022,9,21);
        subs.assignarSubstitució(dataInici, dataFi );
        dades = subs.obtenirDades();
        //System.out.println(dades);

        Professor pr3 = new Professor();
        pr3.canviarSou(500);
        dades = pr3.obtenirDades();
        //System.out.println(dades);

        Institut ins = new Institut();
        ins.canviarNom("La Guineueta");
        ins.afegirPersona(e);
        ins.afegirPersona(e2);
        ins.afegirPersona(pr);
        ins.afegirPersona(pr2);
        ins.afegirPersona(subs);
        ins.imprimirInformacio();
    }
}