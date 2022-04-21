package cat.ilg;

public class Substitur extends Professor{
    private String dataInici;
    private String dataFi;

    public void assignarSubstitució(String dataInici, String dataFi ){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }
    public String obtenirDades(){
        return super.obtenirDades() + " comenca el dia: " + this.dataInici + " i acaba el dia: " + this.dataFi;
    }
}
