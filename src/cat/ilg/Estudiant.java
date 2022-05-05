package cat.ilg;

import java.util.ArrayList;

public class Estudiant extends Persona  {
    private double nota;

    public Estudiant() {}
    ArrayList notes = new ArrayList();
    public void posarNota(double nota) throws Exception{
        if(nota <= 10 && nota >=0) {
            notes.add(nota);
        }else{
            //System.out.print("ERROR: LA NOTA NO ENTRA ENTRE ELS VALORS DEMANATS");
                throw new Exception("ERROR: LA NOTA NO ENTRA ENTRE ELS VALORS DEMANATS");
        }
    }


    public String obtenirDades(){
        if (super.obtenirDades() == "Dades incompletes"){
        return "Dades incompletes";
    }else {
        return super.obtenirDades() + " (Estudiant)que te nota: " + this.notes;
        }
    }

    public double ferMitjana(){

        double mitjana = 0;
        double suma = 0;
        for (int i=0; i<=notes.size(); i++){ //T'HAS QUEDAT AQUIIII!!!! FALAT MITJANA, NOTA MAX I NOTA MIN

        }
    }
}
