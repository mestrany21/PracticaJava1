package cat.ilg;

public class Persona {
    private String nom;
    private String dni;

    public Persona(){

    }

    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void assignarDni(String dni){
        if (this.dni == null){
            this.dni = dni;
        }else{
            System.out.println("ERROR");
        }

    }

    public String obtenirDades(){
        return "Persona que es diu " + this.nom + " amb DNI: "+ this.dni;
    }
}
