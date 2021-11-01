package Gestion.Banque;

import java.time.LocalDate;

public class Compteepargne extends Compte{
    double taux;

    public Compteepargne(int noCompte, LocalDate dateCreation, double solde, Personne client, double taux) {
        super(noCompte, dateCreation, solde, client);
        this.taux = taux;
    }

    @Override
    public void retirer(double montant) {
        solde-=(solde>=montant ? montant : 0);
    }

    @Override
    public String toString() {
        return "Compteepargne{" +
                "noCompte=" + noCompte +
                ", dateCreation=" + dateCreation +
                ", solde=" + solde +
                ", client=" + client.toString() +
                ", taux=" + taux +
                '}';
    }
}
