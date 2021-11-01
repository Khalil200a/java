package Gestion.Banque;

import java.time.LocalDate;

public class OpRetrait extends Operation{
    public OpRetrait(int numero, LocalDate dateOp, Compte cp, double montant) {
        super(numero, dateOp, cp, montant);
    }
    @Override
    public void print(){
        System.out.println( "Retrait = {" +
                "numero=" + numero +
                ", DateOp=" + DateOp +
                ", montant=" + montant +
                '}');
    }

}
