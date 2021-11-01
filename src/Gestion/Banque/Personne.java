package Gestion.Banque;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    int NoClient;
    int tel;
    String nom;
    String prenom;
    List<Compte> comptes = new ArrayList<Compte>();
    void ajouterCompte(Compte newCompte) throws Exception {
        if (!comptes.contains(newCompte)) {
            comptes.add(newCompte);
        }
        else{
            throw new Exception("Compte existant");
        }
    }

    public Personne(int noClient, int tel, String nom, String prenom) {
        NoClient = noClient;
        this.tel = tel;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "NoClient=" + NoClient +
                ", tel=" + tel +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
