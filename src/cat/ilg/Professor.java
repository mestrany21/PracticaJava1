package cat.ilg;

public class Professor extends Persona  {
    private double sou;

    public Professor() {}

    public void canviarSou(double sou){
        if(this.sou < 3000 &&){
            this.sou= sou;
        }else{
            System
        }

    }
    public String obtenirDades(){
        return super.obtenirDades() + " que te un sou de: " + this.sou;
    }
}
