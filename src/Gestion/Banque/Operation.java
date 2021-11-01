package Gestion.Banque;

import java.time.LocalDate;

public abstract class Operation {
    int numero;
    LocalDate DateOp;
    Compte cp;
    double montant;

    public Operation(int numero, LocalDate dateOp, Compte cp, double montant) {
        this.numero = numero;
        this.DateOp = dateOp;
        this.cp = cp;
        this.montant = montant;
    }
    public LocalDate getDateOp(){
        return this.DateOp;
    }
    public void setDateOp(LocalDate DateOp){
        this.DateOp = DateOp;
    }
    @Override
    public String toString() {
        return "Operation{" +
                "numero=" + numero +
                ", DateOp=" + DateOp +
                "," + cp.toString() +
                ", montant=" + montant +
                '}';
    }
    public abstract void print();
 }
