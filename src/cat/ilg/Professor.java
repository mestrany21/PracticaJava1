package cat.ilg;

public class Professor extends Persona  {
    private double sou;

    public Professor() {}

    public void canviarSou(double sou){
        if(sou <= 3000 && sou>=0){
            this.sou= sou;
        }else{
            System.out.print("ERROR: EL SOU NO ENTRA EN ELS VALOR DEMANATS");
        }

    }
    public String obtenirDades(){
        return super.obtenirDades() + " que te un sou de: " + this.sou;
    }
}
