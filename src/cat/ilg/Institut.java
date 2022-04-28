package cat.ilg;

import java.util.ArrayList;

public class Institut {
    public String nom;

    ArrayList <Persona> llista = new ArrayList<Persona>();
    public void afegirPersona(Persona persona) {
        llista.add(persona);
    }
    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void imprimirInformacio(){
        String info = " ";
        for (int i =0; i< llista.size(); i++){
            info = llista.get(i).obtenirDades();
            System.out.println(info);
        }

    }

}
