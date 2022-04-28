package cat.ilg;

import java.util.ArrayList;

public class Estudiant extends Persona  {
    private double nota;

    public Estudiant() {}
    ArrayList notes = new ArrayList();
    public void posarNota(double nota){
        if(nota <= 10 && nota >=0) {
            notes.add(nota);
        }else{
            System.out.print("ERROR: LA NOTA NO ENTRA ENTRE ELS VALORS DEMANATS");
        }
    }


    public String obtenirDades(){
        return super.obtenirDades() + " que te nota: " + this.nota;
    }
}
