package cat.ilg;

import java.util.Date;

public class Substitur extends Professor{
    private Date dataInici;
    private Date dataFi;

    public void assignarSubstituci√≥(Date dataInici, Date dataFi ){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }
    public String obtenirDades(){
        return super.obtenirDades() + " comenca el dia: " + this.dataInici + " i acaba el dia: " + this.dataFi;
    }
}
