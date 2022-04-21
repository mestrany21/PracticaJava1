package cat.ilg;
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        //Persona p2 = new Persona();

        p1.canviarNom("Marc");
        p1.assignarDni("22222222A");
        String dades = p1.obtenirDades();
        System.out.println(dades);

        p1.canviarNom("Albert");
        p1.assignarDni("11111111D");
        dades = p1.obtenirDades();
        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.assignarDni("33333333R");
        e.posarNota(7.5);
        e.canviarNom("Pepito");
        dades= e.obtenirDades();
        System.out.println(dades);

        Professor pr = new Professor();
        pr.canviarNom("Juanito");
        pr.assignarDni("44444444S");
        pr.canviarSou(2500);
        dades = pr.obtenirDades();
        System.out.println(dades);

        Substitur subs = new Substitur();
        subs.canviarNom("Pedro");
        subs.assignarDni("55555555E");
        subs.canviarSou(2000);
        subs.assignarSubstitució("13/04/2013", "20/05/2013");
        dades = subs.obtenirDades();
        System.out.println(dades);



    }
}