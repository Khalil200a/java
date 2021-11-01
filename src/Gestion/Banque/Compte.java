package Gestion.Banque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    protected int noCompte;
    protected LocalDate dateCreation;
    protected double solde;
    protected Personne client;
    protected List<Operation> ops = new ArrayList<Operation>();

    public Compte(int noCompte, LocalDate dateCreation, double solde, Personne client) {
        this.noCompte = noCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }
    public List<Operation> getOps(){
        return ops;
    }
    public void addOps(Operation op){
        if(!ops.contains(op)){
            ops.add(op);
        }
    }
    public void setOps(List<Operation> ops){
        this.ops = ops;
    }
    public abstract void retirer(double montant) throws Exception;

    public void verser(double montant) {
        solde+=montant;
    };

    public void PrintOps(LocalDate dd, LocalDate da){
        dd = dd.minusDays(1);
        da = da.plusDays(1);
        for(Operation op:this.ops){
            if(op.getDateOp().isAfter(dd)&&op.getDateOp().isBefore(da)){
                op.print();
            }
        }
    }

    @Override
    public String toString() {
        return "Compte{" +
                "noCompte=" + noCompte +
                ", dateCreation=" + dateCreation +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }
}
