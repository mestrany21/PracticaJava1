package cat.ilg;

import java.util.ArrayList;

public class Estudiant extends Persona  {
    private double nota;

    public Estudiant() {}
    ArrayList<Double> notes = new ArrayList<>();
    public void posarNota(double nota) throws Exception{
        if(nota <= 10 && nota >=0) {
            notes.add(nota);
        }else{
            //System.out.print("ERROR: LA NOTA NO ENTRA ENTRE ELS VALORS DEMANATS");
                throw new Exception("ERROR: LA NOTA NO ENTRA ENTRE ELS VALORS DEMANATS");
        }
    }


    public double ferMitjana(){

        double mitjana = 0;
        double suma = 0;
        for (int i=0; i<notes.size(); i++){
            suma= suma + notes.get(i);
        }
        mitjana= suma/notes.size();
        return mitjana;
    }

    public double obtenirNotaMin(){
        double min = 10;
        for (int i=0; i<notes.size(); i++){
            if( min > notes.get(i)){
                min = notes.get(i);
            }
        }
        return min;
    }
    public double obtenirNotaMax(){
        double max = 0;
        for (int i=0; i<notes.size(); i++){
            if( max < notes.get(i)){
                max = notes.get(i);
            }
        }
        return max;
    }
    public String obtenirDades(){
        if (super.obtenirDades() == "Dades incompletes"){
            return "Dades incompletes";
        }else {
            return super.obtenirDades() + " (Estudiant)que te nota: " + this.notes + " una mitjana de " + ferMitjana() + "una nota maxima de " + obtenirNotaMax() +" una nota mínima de " + obtenirNotaMin();
        }
    }
}
