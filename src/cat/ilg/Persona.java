package cat.ilg;

public class Persona {
    private String nom;
    private String dni;

    public Persona(){

    }

    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void assignarDni(String dni) throws Exception {
        if (this.dni == null){
            this.dni = dni;

        }else{

            throw new Exception("ERROR");
        }

    }

    public String obtenirDades(){
            if(this.dni==null || this.nom == null){
                return "Dades incompletes";
            }
            else{
                return "Persona que es diu " + this.nom + " amb DNI: " + this.dni;
            }

        }
    }

