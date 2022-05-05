package cat.ilg;

public class Professor extends Persona  {
    private double sou;

    public Professor() {}

    public void canviarSou(double sou) throws Exception {
        if(sou <= 3000 && sou>=0){
            this.sou= sou;
        }else{
            throw new Exception("ERROR SOU");
        }

    }
    public String obtenirDades(){
        if(super.obtenirDades() == "Dades incompletes"){
            return "Dades incompletes";
        }else {
            return super.obtenirDades() + " (Professor)que te un sou de: " + this.sou;
        }
    }
}
