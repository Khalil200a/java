package Gestion.Banque;

import java.time.LocalDate;

public class CompteCheque extends Compte{
    double decouvert;

    public CompteCheque(int noCompte, LocalDate dateCreation, double solde, Personne client, double decouvert) {
        super(noCompte, dateCreation, solde, client);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) throws Exception {
        if(montant<=solde) solde-=montant;
        else if(solde+decouvert<montant){
            throw new Exception("solde insuffisoant! ");
        }
        else {
            double diff = montant-solde;
            decouvert-=diff;
            solde = 0;
        }
    }

    @Override
    public String toString() {
        return "CompteCheque{" +
                "noCompte=" + noCompte +
                ", dateCreation=" + dateCreation +
                ", solde=" + solde +
                ", client=" + client.toString() +
                ", decouvert=" + decouvert +
                '}';
    }
}
